# ssh service
IMAGE_FEATURES_append = "\
                ssh-server-dropbear \
"

# filesystem utils
IMAGE_INSTALL_append = "\
                e2fsprogs \
                e2fsprogs-e2fsck \
                e2fsprogs-mke2fs \
		e2fsprogs-resize2fs \
                dosfstools \
"

# Low level tools
IMAGE_INSTALL_append = "\
                i2c-tools \
                spitools \
                devmem2 \
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
