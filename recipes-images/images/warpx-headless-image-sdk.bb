require warpx-headless-image.bb

IMAGE_FEATURES += " \
    dev-pkgs \
    tools-sdk \
"

EXTRA_IMAGE_FEATURES += " \
    tools-debug \
    tools-profile \
    debug-tweaks \
"

export IMAGE_BASENAME = "warpx-headless-image-sdk"
