DESCRIPTION = "Lemonbeat Python library"
LICENSE = "CLOSED"

inherit python3-dir

SRC_URI += " \
    git://stash.dss.husqvarnagroup.com:7999/sg/lemonbeat-python.git;protocol=ssh \
"

PR = "r0"
PV = "2021-09-22+git${SRCPV}"

SRCREV = "6f82f0bf8af5772a868bd6ff6ef4193e35b23159"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += " \
    lsdl-serializer-lib \
    python3-core \
    python3-ctypes \
    python3-fcntl \
    python3-pycrypto \
    python3-threading \
    python3-xml \
"

do_install() {
    # Files for python3-lemonbeat
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/lemonbeat
    install -m 0755 ${S}/lemonbeat/*.py ${D}${PYTHON_SITEPACKAGES_DIR}/lemonbeat/

    # Files for lemonbeat-firmware-upload
    install -d ${D}${bindir}
    install -m 0755 ${S}/examples/upload.py ${D}${bindir}/upload
}

FILES_${PN} += " \
    ${PYTHON_SITEPACKAGES_DIR}/lemonbeat/* \
"

RDEPENDS_lemonbeat-firmware-upload = " \
    ${PN} \
    lsdl-serializer-lib \
    python3-crcmod \
    python3-multiprocessing \
"

FILES_lemonbeat-firmware-upload = "${bindir}/upload"

PROVIDES =+ "lemonbeat-firmware-upload"
PACKAGES =+ "lemonbeat-firmware-upload"
