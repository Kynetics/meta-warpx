FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

RDEPENDS_${PN} += " hwrevision"

SRC_URI += "\
	file://head_bg.gif \
"

do_install_append () {
        rm ${D}/www/head_bg.gif
        install -m 0755 ${WORKDIR}/head_bg.gif ${D}/www/head_bg.gif
}
