FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://10-eth0.network \
"

do_install:append() {
   #install -d ${D}${sysconfdir}/systemd/network
   #install -m 0644 ${WORKDIR}/10-eth0.network ${D}${sysconfdir}/systemd/network/
   
   install -d ${D}${systemd_unitdir}/network/
   install -m 0644 ${WORKDIR}/10-eth0.network ${D}${systemd_unitdir}/network/
}

FILES:${PN}:append = " ${systemd_unitdir}/network/"
#${sysconfdir}/systemd/network 
 

 

