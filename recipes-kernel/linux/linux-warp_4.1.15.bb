# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA

require recipes-kernel/linux/linux-imx.inc

SUMMARY = "Linux kernel for WaRP board"

SRC_URI = "git://github.com/warpboard/linux-imx6.git;branch=${SRCBRANCH} \
           file://defconfig"

LOCALVERSION = "-1.0.0_ga"
SRCBRANCH = "warpx/imx_4.1.15_1.0.0_ga"
SRCREV = "38d975e2af127349d43daec6022446caad7034a0"
DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "(warp)"
