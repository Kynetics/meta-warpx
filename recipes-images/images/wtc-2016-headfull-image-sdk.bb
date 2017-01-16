require wtc-2016-headfull-image.bb

IMAGE_FEATURES += " \
    dev-pkgs \
    tools-sdk \
"

EXTRA_IMAGE_FEATURES += " \
    tools-debug \
    tools-profile \
    debug-tweaks \
"

export IMAGE_BASENAME = "wtc-2016-headfull-image-sdk"
