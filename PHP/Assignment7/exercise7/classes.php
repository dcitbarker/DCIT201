<?php
class BankAccount {

    private $accountNumber;
    private $accountHolderName;
    private $balance = 0.0;

    public function deposit($amount) {
        $this->balance += $amount;
    }
    
    function withdraw($amount) {
        if($this->balance >= $amount) {
            $this->balance -= $amount;
            echo "<span style='color:red'> > GHc".$amount.
                " deducted from your account successfully</span><br />";
        }
        else {
            echo "<p style='color:red'> > Not Enough Balance</p>";
        }
    }

	public function getBalance() {
		return $this->balance;
	}

    public function setBalance($value) {
		$this->balance = $value;
	}
}

class SavingsAccount extends BankAccount {

    private $interestRate;

	public function getInterestRate() {
		return $this->interestRate;
	}

	public function setInterestRate($value) {
		$this->interestRate = $value;
	}

    public function addInterest(){
        if($this->interestRate > 0) {
            $interest = ($this->interestRate / 100) * parent::getBalance();

            echo "<p style='color:#0000FF'> > ";
            echo "Congratulations, you have earned <b></b>GHc".$interest."</b> ";
            echo " on your Savings.</p>";
            echo "Previous Balance: <b></b>GHc".parent::getBalance()."</b><br />";
            echo "Interest Earned: <b></b>GHc".$interest."</b><br />";
            
            parent::deposit($interest);     // save interest

            echo "New Balance: <b></b>GHc".parent::getBalance()."</b><br />";
        }
        else {
            echo "<p style='color:#FF0000'> > Interest Rate Cannot Be Zero(0)</p>";
        }
    }
}

class CheckingAccount extends BankAccount {

    private $transactionFee;

	public function getTransactionFee() {
		return $this->transactionFee;
	}

	public function setTransactionFee($value) {
		$this->transactionFee = $value;
	}

    // an over - simply declaring the method with same name as parent method
    public function withdraw($amount) {
        $balance = parent::getBalance() - $this->getTransactionFee();
        echo "<span style='color:#FF0000'> > Transaction Charge: <b>GHc".$this->transactionFee."</b></span><br />";
        return $balance;
    }
}
?>