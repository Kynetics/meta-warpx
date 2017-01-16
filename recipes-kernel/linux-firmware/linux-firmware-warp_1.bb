SUMMARY = "Firmware files for use with Linux kernel"
SECTION = "kernel"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

COMPATIBLE_MACHINE = "(warp)"

SRC_URI = "file://SH_nVram.txt"

S = "${WORKDIR}"

do_install () {
        install -d ${D}/lib/firmware/brcm
	install -m 0644 ${S}/SH_nVram.txt ${D}/lib/firmware/brcm/brcmfmac4330-sdio.txt
}

FILES_${PN} = "/lib/firmware/brcm/*"
