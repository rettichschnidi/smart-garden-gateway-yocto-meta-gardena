SUMMARY = "Manage data migration on system upgrade"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

FILESEXTRAPATHS_append := "${THISDIR}/files:"

SRC_URI = " \
    file://keep.d/sysupgrade \
    file://sysupgrade.conf \
    file://sysupgrade.service \
    file://sysupgrade.sh \
"

PR = "r0"
PV = "0.6"

RDEPENDS_${PN} = "initscripts-readonly-rootfs-overlay"

FILES_${PN} += " \
    ${base_libdir}/upgrade/keep.d \
"

do_install () {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/sysupgrade.sh ${D}${bindir}/sysupgrade

    install -d ${D}${base_libdir}/upgrade/keep.d
    install -m 0644 ${WORKDIR}/keep.d/sysupgrade ${D}${base_libdir}/upgrade/keep.d

    install -d ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/sysupgrade.conf ${D}${sysconfdir}

    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/sysupgrade.service ${D}${systemd_unitdir}/system
}

SYSTEMD_SERVICE_${PN} += "sysupgrade.service"

inherit systemd allarch
