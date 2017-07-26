FILESEXTRAPATHS_append := "${THISDIR}/${PN}:"

SRC_URI += "\
	file://0001-warp-Change-default-bootenv-configuration.patch \
	file://fw_env.config \
"

do_install_append () {
	rm ${D}${sysconfdir}/fw_env.config
	install -m 0644 ${WORKDIR}/fw_env.config ${D}${sysconfdir}/fw_env.config
}
