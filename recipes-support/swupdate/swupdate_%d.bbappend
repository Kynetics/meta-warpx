FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

RDEPENDS_${PN} += " hwrevision"

python () {
    try:
        defconfig = bb.fetch2.localpath('file://defconfig', d)
    except bb.fetch2.FetchError:
        return

    try:
        configfile = open(defconfig)
    except IOError:
        return

    features = configfile.readlines()
    configfile.close()

    if 'CONFIG_SURICATTA=y\n' in features:
        depends = d.getVar('DEPENDS', False)
        d.setVar('DEPENDS', depends + ' curl')
}
