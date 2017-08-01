include filesystem_utils.inc

# ssh service
IMAGE_FEATURES_append = "\
                ssh-server-dropbear \
"

# Low level tools
IMAGE_INSTALL_append = "\
                i2c-tools \
                spitools \
                devmem2 \
                u-boot-fw-utils \
                evtest \
"

# screen
IMAGE_INSTALL_append = "\
                screen \
"

# curl
IMAGE_INSTALL_append = "\
                curl \
"

# ntp service
IMAGE_INSTALL_append = "ntp \
                ntpdate \
"

# resolvconf
IMAGE_INSTALL_append = "\
                resolvconf \
"

# watchdog
IMAGE_INSTALL_append = "\
                watchdog \
"

# network utils
IMAGE_INSTALL_append = "\
                iw \
"

# python and associated modules
IMAGE_INSTALL_append = "\
                python-core \
                python-pyserial \
                python-pip \
                python-json \
                python-pydoc \
                python-misc \
                python-twisted \
                python-numpy \
                python-dbus \
"

# git
IMAGE_INSTALL_append = "\
                git \
"
