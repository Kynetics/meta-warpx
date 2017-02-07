require recipes-graphics/images/core-image-x11.bb
require warpx.inc

SUMMARY = "Warpx demo image with graphics"

LICENSE := "MIT"

# WTC session
IMAGE_INSTALL_append = "\
	wtc-session \
"

# fbdev driver
IMAGE_INSTALL_append = "\
	xf86-video-fbdev \
"

# fb screenshots
IMAGE_INSTALL_append = "\
	fbgrab \
"

IMAGE_INSTALL_append = "\
	g-multi-autostart \
"

export IMAGE_BASENAME = "warpx-headfull-image"
