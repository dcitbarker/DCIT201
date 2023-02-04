import QtQuick
import QtQuick.Controls.Basic
ApplicationWindow {
    visible: true
    width: 360
    height: 360
    x: screen.desktopAvailableWidth - width - 12
    y: screen.desktopAvailableHeight - height - 48
    title: "HelloApp"
    //flags: Qt.FramelessWindowHint | Qt.Window
    property string currTime: "00:00:00"
    property QtObject backend
    Rectangle {
        anchors.fill: parent
        Image {
            sourceSize.width: parent.width
            sourceSize.height: parent.height
            source: "./images/1.jpeg"
            fillMode: Image.PreserveAspectFit
        }
        Text {
            anchors {
                bottomMargin: 12
                left: parent.left
                leftMargin: 12
            }
            text: "Hi, I am Shedeur\nI am always happy to help"
            font.pixelSize: 16
            color: "white"
        }
        Text {
            anchors {
                bottom: parent.bottom
                bottomMargin: 12
                left: parent.left
                leftMargin: 12
            }
            text: currTime
            font.pixelSize: 48
            color: "white"
        }
    }

    Connections {
        target: backend
        function onUpdated(msg) {
            currTime = msg;
        }
    }
}