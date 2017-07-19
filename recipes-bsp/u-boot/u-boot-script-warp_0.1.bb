LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;md5=a2c678cfd4a4d97135585cad908541c6"
DEPENDS = "u-boot-mkimage-native"

SRC_URI = "\
    file://bootscript.txt \
    file://README \
"

S = "${WORKDIR}"

inherit deploy

BOOTSCRIPT = "${S}/bootscript.txt"

do_mkimage () {
    uboot-mkimage -A arm -O linux -T script -C none -a 0 -e 0 \
                  -n "boot script" -d ${BOOTSCRIPT} ${S}/boot.scr
}

addtask mkimage after do_compile before do_install

do_deploy () {
    install -d ${DEPLOYDIR}
    install ${S}/boot.scr \
            ${DEPLOYDIR}/boot.scr-${PV}-${PR}

    cd ${DEPLOYDIR}
    rm -f boot.scr
    ln -sf boot.scr-${PV}-${PR} boot.scr
}

addtask deploy after do_install before do_build

do_compile[noexec] = "1"
do_install[noexec] = "1"
do_populate_sysroot[noexec] = "1"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(warp)"
