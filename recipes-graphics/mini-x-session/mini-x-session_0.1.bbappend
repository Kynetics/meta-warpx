FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "\
	file://mini-x-session_cleanup.patch;striplevel=0 \
	file://mini-x-session_no-cursor.patch;striplevel=0 \
"
