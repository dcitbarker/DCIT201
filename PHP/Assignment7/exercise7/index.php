<?php
/**
 * Index/Main File
 */
include_once("classes.php");

$account = new BankAccount;

echo "<strong>Starting Balance:</strong><br />";
echo "GHc<b>".$account->getBalance()."</b><p></p>";

echo "<strong>Making A 1000 cedis Deposit:</strong><br />";

$account->deposit(1000.50);

echo "Current Balance: GHc<b>".$account->getBalance()."</b><p></p>";

echo "<strong>Making A 300 cedis Withdrawal:</strong><br />";

$account->withdraw(300);

$charges = new CheckingAccount;
$charges->deposit($account->getBalance());
$charges->setTransactionFee(2.5);
$account->setBalance($charges->withdraw($account->getBalance()));

echo "Current Balance: GHc<b>".$account->getBalance()."</b><p></p>";

// making an illegal withdrawal
echo "<strong>Making A 3000 cedis Withdrawal:</strong><br />";

$account->withdraw(3000);

echo "> Current Balance: GHc<b>".$account->getBalance()."</b><p></p>";

////// Savings Area
echo "<strong>SAVINGS ACCOUNT INTERESTS:</strong><br />";
$savings = new SavingsAccount;
$savings->deposit($account->getBalance());

$savings->setInterestRate(3.5);

$savings->addInterest();


?>