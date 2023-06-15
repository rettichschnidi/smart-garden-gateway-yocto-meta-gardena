# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get lemonbeatd could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/lemonbeatd/1.6.0"
SRC_URI += "gitsm://git@ssh.dev.azure.com/v3/HQV-Gardena/SG-Gateway/sg-lemonbeat-cargo;protocol=ssh;nobranch=1"
SRCREV = "07a50f9b225f9e438d34675a24c049ec37c4df5d"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = "lemonbeatd"


# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/aes/0.7.5 \
    crate://crates.io/aho-corasick/0.7.20 \
    crate://crates.io/anyhow/1.0.71 \
    crate://crates.io/approx/0.5.1 \
    crate://crates.io/argh/0.1.10 \
    crate://crates.io/argh_derive/0.1.10 \
    crate://crates.io/argh_shared/0.1.10 \
    crate://crates.io/async-attributes/1.1.2 \
    crate://crates.io/async-channel/1.8.0 \
    crate://crates.io/async-executor/1.5.1 \
    crate://crates.io/async-global-executor/2.0.4 \
    crate://crates.io/async-io/1.13.0 \
    crate://crates.io/async-lock/2.7.0 \
    crate://crates.io/async-mutex/1.4.0 \
    crate://crates.io/async-std/1.12.0 \
    crate://crates.io/async-task/4.4.0 \
    crate://crates.io/async-trait/0.1.68 \
    crate://crates.io/atomic-waker/1.1.1 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/0.1.8 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/base64ct/1.1.1 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/block-modes/0.8.1 \
    crate://crates.io/block-padding/0.2.1 \
    crate://crates.io/blocking/1.3.1 \
    crate://crates.io/bumpalo/3.12.2 \
    crate://crates.io/byteorder/1.4.3 \
    crate://crates.io/bytes/1.4.0 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.19 \
    crate://crates.io/cipher/0.3.0 \
    crate://crates.io/cmake/0.1.50 \
    crate://crates.io/concurrent-queue/2.2.0 \
    crate://crates.io/const-oid/0.6.2 \
    crate://crates.io/convert_case/0.5.0 \
    crate://crates.io/cpufeatures/0.2.7 \
    crate://crates.io/crc-catalog/2.2.0 \
    crate://crates.io/crc/3.0.1 \
    crate://crates.io/crypto-bigint/0.2.11 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/ctor/0.1.26 \
    crate://crates.io/dbus-tokio/0.7.6 \
    crate://crates.io/dbus/0.9.7 \
    crate://crates.io/der/0.4.5 \
    crate://crates.io/derivative/2.2.0 \
    crate://crates.io/digest/0.10.6 \
    crate://crates.io/digest/0.9.0 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/env_logger/0.9.3 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.3.1 \
    crate://crates.io/event-listener/2.5.3 \
    crate://crates.io/fastrand/1.9.0 \
    crate://crates.io/futures-channel/0.3.28 \
    crate://crates.io/futures-core/0.3.28 \
    crate://crates.io/futures-executor/0.3.28 \
    crate://crates.io/futures-io/0.3.28 \
    crate://crates.io/futures-lite/1.13.0 \
    crate://crates.io/futures-macro/0.3.28 \
    crate://crates.io/futures-sink/0.3.28 \
    crate://crates.io/futures-task/0.3.28 \
    crate://crates.io/futures-timer/3.0.2 \
    crate://crates.io/futures-util/0.3.28 \
    crate://crates.io/futures/0.3.28 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getrandom/0.2.9 \
    crate://crates.io/gloo-timers/0.2.6 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/hermit-abi/0.3.1 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/humantime-serde/1.1.1 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/io-lifetimes/1.0.10 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itoa/1.0.6 \
    crate://crates.io/js-sys/0.3.62 \
    crate://crates.io/kv-log-macro/1.0.7 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.144 \
    crate://crates.io/libdbus-sys/0.2.5 \
    crate://crates.io/libm/0.2.6 \
    crate://crates.io/linux-raw-sys/0.3.7 \
    crate://crates.io/lock_api/0.4.9 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/mio/0.8.6 \
    crate://crates.io/nng-sys/1.4.0-rc.0 \
    crate://crates.io/nng/1.0.1 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/num-bigint-dig/0.7.0 \
    crate://crates.io/num-bigint/0.4.3 \
    crate://crates.io/num-derive/0.3.3 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-iter/0.1.43 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/once_cell/1.17.1 \
    crate://crates.io/opaque-debug/0.3.0 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/parking/2.1.0 \
    crate://crates.io/parking_lot/0.12.1 \
    crate://crates.io/parking_lot_core/0.9.7 \
    crate://crates.io/pem-rfc7468/0.2.4 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkcs1/0.2.4 \
    crate://crates.io/pkcs8/0.7.6 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/polling/2.8.0 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.56 \
    crate://crates.io/quick-xml/0.23.1 \
    crate://crates.io/quote/1.0.27 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/redox_syscall/0.3.5 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-syntax/0.6.29 \
    crate://crates.io/regex/1.7.3 \
    crate://crates.io/rsa/0.5.0 \
    crate://crates.io/rstest/0.13.0 \
    crate://crates.io/rstest_macros/0.13.0 \
    crate://crates.io/rustc_version/0.4.0 \
    crate://crates.io/rustix/0.37.19 \
    crate://crates.io/ryu/1.0.13 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/semver/1.0.17 \
    crate://crates.io/serde/1.0.162 \
    crate://crates.io/serde_derive/1.0.162 \
    crate://crates.io/serde_json/1.0.96 \
    crate://crates.io/serde_yaml/0.9.21 \
    crate://crates.io/serial_test/1.0.0 \
    crate://crates.io/serial_test_derive/1.0.0 \
    crate://crates.io/sha2/0.10.6 \
    crate://crates.io/sharded-slab/0.1.4 \
    crate://crates.io/slab/0.4.8 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/socket2/0.4.9 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/spki/0.4.1 \
    crate://crates.io/subtle/2.5.0 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.15 \
    crate://crates.io/tempfile/3.5.0 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/test-log/0.2.11 \
    crate://crates.io/thiserror-impl/1.0.40 \
    crate://crates.io/thiserror/1.0.40 \
    crate://crates.io/time/0.1.45 \
    crate://crates.io/tokio-macros/2.1.0 \
    crate://crates.io/tokio-util/0.7.8 \
    crate://crates.io/tokio/1.28.1 \
    crate://crates.io/tracing-attributes/0.1.24 \
    crate://crates.io/tracing-core/0.1.30 \
    crate://crates.io/tracing-log/0.1.3 \
    crate://crates.io/tracing-subscriber/0.3.17 \
    crate://crates.io/tracing/0.1.37 \
    crate://crates.io/typenum/1.16.0 \
    crate://crates.io/unicode-ident/1.0.8 \
    crate://crates.io/unsafe-libyaml/0.2.8 \
    crate://crates.io/uuid/1.3.2 \
    crate://crates.io/valuable/0.1.0 \
    crate://crates.io/value-bag/1.0.0-alpha.9 \
    crate://crates.io/version-compare/0.1.1 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/waker-fn/1.1.0 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.85 \
    crate://crates.io/wasm-bindgen-futures/0.4.35 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.85 \
    crate://crates.io/wasm-bindgen-macro/0.2.85 \
    crate://crates.io/wasm-bindgen-shared/0.2.85 \
    crate://crates.io/wasm-bindgen/0.2.85 \
    crate://crates.io/web-sys/0.3.62 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows-targets/0.48.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.0 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.48.0 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.48.0 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.48.0 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.48.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.0 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.48.0 \
    crate://crates.io/zeroize/1.4.3 \
    crate://crates.io/zeroize_derive/1.4.2 \
    git://github.com/Amanieu/thread_local-rs.git;protocol=https;nobranch=1;name=thread_local;destsuffix=thread_local \
    git://github.com/husqvarnagroup/nix.git;protocol=https;nobranch=1;name=nix;destsuffix=nix \
    git://github.com/xacrimon/dashmap.git;protocol=https;nobranch=1;name=dashmap;destsuffix=dashmap \
"

SRCREV_FORMAT .= "_dashmap"
SRCREV_dashmap = "v5.2.0"
EXTRA_OECARGO_PATHS += "${WORKDIR}/dashmap"
SRCREV_FORMAT .= "_nix"
SRCREV_nix = "r0.23-ipv6_traffic_class"
EXTRA_OECARGO_PATHS += "${WORKDIR}/nix"
SRCREV_FORMAT .= "_thread_local"
SRCREV_thread_local = "1.1.4"
EXTRA_OECARGO_PATHS += "${WORKDIR}/thread_local"

# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

SUMMARY = "lemonbeatd"
HOMEPAGE = "git@ssh.dev.azure.com/v3/HQV-Gardena/SG-Gateway/sg-bnw-cloud-adapter"
LICENSE = "CLOSED"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include lemonbeatd-${PV}.inc
include lemonbeatd.inc

# Added by rust-recipe.sh
SRC_URI += " \
    file://THIRDPARTY.toml \
"

LIC_FILES_CHKSUM += " \
    file://../THIRDPARTY.toml;md5=448e622ee67db903f6392f3313a653c2 \
"
