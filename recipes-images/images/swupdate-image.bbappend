IMAGE_FSTYPES = "cpio.gz.u-boot"

# Install firmware and modules
IMAGE_INSTALL += "\
	${MACHINE_EXTRA_RRECOMMENDS} \
"

# Install wifi utilities
IMAGE_INSTALL += "\
	iw \
	wpa-supplicant \
"
