FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "\
	file://99-calibration.conf \
"

do_install_append() {
	install -m 0644 ${WORKDIR}/99-calibration.conf ${D}${datadir}/X11/xorg.conf.d/99-calibration.conf
}
