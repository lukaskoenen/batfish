load("@batfish//skylark:junit.bzl", "junit_tests")

package(
    default_testonly = True,
    default_visibility = ["//visibility:private"],
)

junit_tests(
    name = "tests",
    srcs = glob(
        ["*.java"],
        exclude = ["Test*.java"],
    ),
    deps = [
        "//projects/batfish:batfish_testlib",
        "//projects/batfish-common-protocol:common",
        "//projects/batfish-common-protocol/src/test/java/org/batfish/datamodel/matchers:matchers",
        "//projects/batfish/src/main/java/org/batfish/vendor/check_point_management",
        "@maven//:com_fasterxml_jackson_core_jackson_core",
        "@maven//:com_fasterxml_jackson_core_jackson_databind",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
        "@maven//:com_google_guava_guava_testlib",
        "@maven//:junit_junit",
        "@maven//:org_apache_commons_commons_lang3",
        "@maven//:org_hamcrest_hamcrest",
    ],
)
