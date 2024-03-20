FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

#SRC_URI += " file://swupdate.service \
#    file://swupdate.socket \
#"
SRC_URI += " \
    file://swupdate.cfg \
    file://defconfig \
    file://swupdate.service \
"

DEPENDS:append = " systemd"

do_install:append(){
    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/swupdate.service ${D}${systemd_system_unitdir}
    #install -m 0644 ${WORKDIR}/swupdate.socket ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/swupdate.cfg ${D}${sysconfdir}/
}
#${D}${libdir}/swupdate/conf.d
SWUPDATE_SOCKET_CTRL_PATH = "/run/sockinstctrl"
SWUPDATE_SOCKET_PROGRESS_PATH = "/run/swupdateprog"

SYSTEMD_AUTO_ENALE:${PN}="enable"

