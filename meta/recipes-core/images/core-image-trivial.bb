SUMMARY = "Dummy CI test recipe"
LICENSE = "MIT"

# fetch a file to test download cache
SRC_URI = "https://ftp.gnu.org/gnu/wget/wget-1.21.4.tar.gz"  # Example URL
S = "${WORKDIR}/wget-1.21.4"

do_fetch() {
    echo "Fetching source from ${SRC_URI}"
}

do_compile() {
    # Create a dummy file that will act as the "image" file
    echo "This is a dummy image file generated from BitBake" > ${S}/dummy_image.txt
}

do_install() {
    # Install the dummy image file into the destination directory
    install -d ${D}${bindir}
    install -m 0644 ${S}/dummy_image.txt ${D}${bindir}/dummy-image.txt
}

IMAGE_FSTYPES = "tar.gz"
