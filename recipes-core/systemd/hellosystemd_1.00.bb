LICENSE = "CLOSED"
inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "hello.service"

SRC_URI = " file://hello.service "
FILES_${PN} += "${systemd_unitdir}/system/hello.service"

do_install:append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/hello.service ${D}/${systemd_unitdir}/system
}
