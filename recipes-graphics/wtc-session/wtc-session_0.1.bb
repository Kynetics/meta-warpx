SUMMARY = "WTC X11 session startup"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://wtc-session;beginline=5;endline=23;md5=a236df9860bc23cdb73ff211b386eb5e"
SECTION = "x11"

SRC_URI = "file://wtc-session"

RDEPENDS_${PN} = "mini-x-session wtc2016-demo"

S = "${WORKDIR}"

do_install() {
	install -d ${D}/${sysconfdir}/mini_x/session.d/
	install -m 0755 ${WORKDIR}/wtc-session ${D}/${sysconfdir}/mini_x/session.d/wtc-session
}
