require mender-artifact.inc

SRC_URI = "git://github.com/mendersoftware/mender-artifact.git;protocol=https;branch=2.2.x"

# Tag: 2.2.0b1
SRCREV = "00ee00c95db4f2dae0ec23a3165acde9ab34b2a7"

# Enable this in Betas, not in finals.
# Downprioritize this recipe in version selections.
DEFAULT_PREFERENCE = "-1"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/github.com/mendersoftware/mender-artifact/LIC_FILES_CHKSUM.sha256;md5=1baf9ba39aca12f99a87a99b18440e84"
