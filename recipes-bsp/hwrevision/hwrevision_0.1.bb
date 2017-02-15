# Copyright (C) 2017 Kynetics, LLC
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Hardware revision for Warp board"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7d588d1ee3ad3a290b75170ab9f0b9a3"

SRC_URI = "\
	file://LICENSE \
	file://hwrevision \
"

S = "${WORKDIR}"

do_install() {
	install -d ${D}${sysconfdir}
	install -m 0644 ${S}/hwrevision ${D}${sysconfdir}
}

FILES_${PN} = "${sysconfdir}"
