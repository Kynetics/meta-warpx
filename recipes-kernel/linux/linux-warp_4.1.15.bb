# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for WaRP board"

SRC_URI = "git://git@github.com/revolution-robotics/warp-kernel.git;protocol=ssh;branch=${SRCBRANCH} \
           file://defconfig"

LOCALVERSION = "-1.0.0_ga"
SRCBRANCH = "warp/jacob/imx_4.1.15_1.0.0_ga_2.4in+epd"
SRCREV = "254b3a0322a1836f2c50e437e12a5b9c1859dc18"
DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "(warp)"
