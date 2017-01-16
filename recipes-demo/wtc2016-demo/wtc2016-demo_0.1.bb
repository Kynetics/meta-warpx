SUMMARY = "WTC 2016 Demo files"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://main.py;beginline=1;endline=20;md5=4ca5694ca2fbb565f5d74ab0c6c6beac"

SRC_URI = "\
	file://main.py \
	"

S = "${WORKDIR}"

RDEPENDS_${PN} = "\
       python-pyqt \
       qtbase-fonts \
       qtbase-fonts-pfa \
       qtbase-fonts-pfb \
       qtbase-fonts-qpf \
       qtbase-fonts-ttf-dejavu \
       qtbase-fonts-ttf-vera \
       qtbase-tools \
"

do_install () {
        install -d ${D}/opt/wtc2016/
	install -m 0755 ${S}/main.py ${D}/opt/wtc2016/
}

FILES_${PN} = "/opt/wtc2016/*"
