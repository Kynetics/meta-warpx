do_install_append() {
	rm ${D}${sysconfdir}/X11/Xsession.d/30xinput_calibrate.sh
	rm -rf ${D}${sysconfdir}/xdg/autostart/
}
