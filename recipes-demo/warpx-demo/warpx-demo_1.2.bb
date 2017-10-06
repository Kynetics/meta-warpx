SUMMARY = "Warpx Demo files"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://main.py;beginline=1;endline=20;md5=4ca5694ca2fbb565f5d74ab0c6c6beac"

SRC_URI = "\
	file://main.py \
	"

S = "${WORKDIR}"

RDEPENDS_${PN} = "\
       python-pyqt5 \
       qtbase-tools \
       ttf-dejavu-sans \
       ttf-dejavu-sans-mono \
       ttf-dejavu-sans-condensed \
       ttf-dejavu-serif \
       ttf-dejavu-serif-condensed \
       ttf-liberation-mono \
       ttf-liberation-sans \
       ttf-liberation-serif \
"

do_install () {
        install -d ${D}/opt/warpx/
	install -m 0755 ${S}/main.py ${D}/opt/warpx/
}

FILES_${PN} = "/opt/warpx/*"
