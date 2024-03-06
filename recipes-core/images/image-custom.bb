SUMMARY = "bitbake-layers recipe"

DESCRIPTION = "Recipe created by bitbake-layers"
IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image


IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE:append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "", d)}"

WKS_IMAGE_FSTYPES += "wic wic.bz2 wic.bmap"
WKS_FILE += "stm32mp1_partitions.wks.in"

ACCEPT_EULA_stm32mp1 = "1"
