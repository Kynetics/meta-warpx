# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for WaRP board"

SRC_URI = "git://github.com/warpboard/linux-imx6.git;branch=${SRCBRANCH} \
           file://defconfig"

LOCALVERSION = "-1.0.0_ga"
SRCBRANCH = "warpx/imx_4.1.15_1.0.0_ga"
SRCREV = "b0ab2eb84c055b36cac8f87d39415a4bc24d0b66"
DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "(warp)"
