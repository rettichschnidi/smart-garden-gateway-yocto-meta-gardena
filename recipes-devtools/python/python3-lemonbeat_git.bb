DESCRIPTION = "Lemonbeat Python library"
LICENSE = "CLOSED"

inherit python3-dir

SRC_URI += " \
    git://stash.dss.husqvarnagroup.com/scm/sg/lemonbeat-python.git;protocol=https \
"

PR = "r0"
PV = "2019-04-11+git${SRCPV}"

SRCREV = "d4ab0c4c24ea21873bbf9b80f1f998304e8f99e7"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += " \
    lsdl-serializer-lib \
    python3-core \
    python3-fcntl \
    python3-threading \
    python3-xml \
"

do_install() {
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/lemonbeat
    install -m 0755 ${S}/lemonbeat/*.py ${D}${PYTHON_SITEPACKAGES_DIR}/lemonbeat/
}

FILES_${PN} += " \
    ${PYTHON_SITEPACKAGES_DIR}/lemonbeat/* \
"
