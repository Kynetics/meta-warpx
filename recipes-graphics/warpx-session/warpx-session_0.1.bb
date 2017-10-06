SUMMARY = "Warpx X11 session startup"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://warpx-session;beginline=5;endline=23;md5=a236df9860bc23cdb73ff211b386eb5e"
SECTION = "x11"

SRC_URI = "file://warpx-session"

RDEPENDS_${PN} = "mini-x-session warpx-demo"

S = "${WORKDIR}"

do_install() {
	install -d ${D}/${sysconfdir}/mini_x/session.d/
	install -m 0755 ${WORKDIR}/warpx-session ${D}/${sysconfdir}/mini_x/session.d/warpx-session
}
