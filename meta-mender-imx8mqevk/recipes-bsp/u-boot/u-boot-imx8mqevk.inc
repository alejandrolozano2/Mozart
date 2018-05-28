FILESEXTRAPATHS_prepend_imx8mqevk := "${THISDIR}/patches:"

BOOTENV_SIZE_imx8mqevk ?= "0x1000"

# U-Boot auto-configuration doesn't work properly for Raspberry Pi, due to its
# use of boot.scr and cmdline.txt.

SRC_URI_append += " \
                        file://0001-imx8mq_evk-BOOTCOUNT.patch \
"
