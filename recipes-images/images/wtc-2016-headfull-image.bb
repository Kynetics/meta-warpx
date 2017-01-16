require recipes-graphics/images/core-image-x11.bb
require wtc-2016.inc

SUMMARY = "Wearable Technologies Conference 2016 demo image with graphics"

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

export IMAGE_BASENAME = "wtc-2016-headfull-image"
