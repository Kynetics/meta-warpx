#
# Copyright (C) 2016, Kynetics LLC
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.


import sys
from PyQt5 import QtWidgets
from PyQt5 import QtGui, QtCore


def app():
    app = QtWidgets.QApplication(sys.argv)
    window = QtWidgets.QWidget()


    window.setGeometry(0,0,320,240)

    button = QtWidgets.QPushButton("warp_0x01 featuring PyQT5")
    button.setStyleSheet("color: blue; background: silver; border: 3px solid darkgreen;")
    label = QtWidgets.QLabel("> warpx.io, Wearable and IoT Community")
    label2 = QtWidgets.QLabel("www.warpx.io/resources")
    label3 = QtWidgets.QLabel("OS version 1.2")
    label.setAlignment(QtCore.Qt.AlignCenter)
    label2.setAlignment(QtCore.Qt.AlignCenter)
    label3.setAlignment(QtCore.Qt.AlignCenter)

    layout =  QtWidgets.QVBoxLayout()
    layout.addWidget(button)
    layout.addWidget(label)
    layout.addWidget(label2)
    layout.addWidget(label3)
    window.setLayout(layout)
    window.setWindowFlags(QtCore.Qt.CustomizeWindowHint | QtCore.Qt.FramelessWindowHint | QtCore.Qt.Tool)
    window.show()


    app.exec_()
    sys.exit()


if __name__ == '__main__':
	app()
