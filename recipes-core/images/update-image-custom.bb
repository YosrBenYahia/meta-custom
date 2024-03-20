SUMMARY = "bitbake-layers recipe"

DESCRIPTION = "Recipe created by bitbake-layers"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit swupdate

SRC_URI = "file://sw-description"

IMAGE_DEPENDS= "image-custom"

SWUPDATE_IMAGES = "image-custom-stm32mp1.ext4.gz" 
