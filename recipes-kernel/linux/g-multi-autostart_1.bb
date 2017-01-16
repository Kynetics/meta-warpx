SUMMARY = "Autoload file for g-multi"
SECTION = "kernel"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "\
	file://g_multi.conf \
	file://g_multi_modprobe.conf \
"

S = "${WORKDIR}"

do_install () {
        install -d ${D}${sysconfdir}/modules-load.d
        install -d ${D}${sysconfdir}/modprobe.d
	install -m 0644 ${S}/g_multi.conf ${D}${sysconfdir}/modules-load.d/g_multi.conf
	install -m 0644 ${S}/g_multi_modprobe.conf ${D}${sysconfdir}/modprobe.d/g_multi.conf
}

FILES_${PN} = "${sysconfdir}/modules-load.d/* ${sysconfdir}/modprobe.d/*"
