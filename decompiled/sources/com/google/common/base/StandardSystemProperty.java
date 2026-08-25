package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.GwtIncompatible
@com.google.common.base.ElementTypesAreNonnullByDefault
public final enum StandardSystemProperty extends java.lang.Enum<com.google.common.base.StandardSystemProperty> {
    private static final /* synthetic */ com.google.common.base.StandardSystemProperty[] $VALUES = null;
    public static final com.google.common.base.StandardSystemProperty FILE_SEPARATOR = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_CLASS_PATH = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_CLASS_VERSION = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_COMPILER = null;

    @java.lang.Deprecated
    public static final com.google.common.base.StandardSystemProperty JAVA_EXT_DIRS = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_HOME = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_IO_TMPDIR = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_LIBRARY_PATH = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_SPECIFICATION_NAME = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_SPECIFICATION_VENDOR = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_SPECIFICATION_VERSION = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VENDOR = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VENDOR_URL = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VERSION = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VM_NAME = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VM_SPECIFICATION_NAME = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VM_SPECIFICATION_VENDOR = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VM_SPECIFICATION_VERSION = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VM_VENDOR = null;
    public static final com.google.common.base.StandardSystemProperty JAVA_VM_VERSION = null;
    public static final com.google.common.base.StandardSystemProperty LINE_SEPARATOR = null;
    public static final com.google.common.base.StandardSystemProperty OS_ARCH = null;
    public static final com.google.common.base.StandardSystemProperty OS_NAME = null;
    public static final com.google.common.base.StandardSystemProperty OS_VERSION = null;
    public static final com.google.common.base.StandardSystemProperty PATH_SEPARATOR = null;
    public static final com.google.common.base.StandardSystemProperty USER_DIR = null;
    public static final com.google.common.base.StandardSystemProperty USER_HOME = null;
    public static final com.google.common.base.StandardSystemProperty USER_NAME = null;
    private final java.lang.String key;

    private static /* synthetic */ com.google.common.base.StandardSystemProperty[] $values() {
            r0 = 28
            com.google.common.base.StandardSystemProperty[] r0 = new com.google.common.base.StandardSystemProperty[r0]
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_VERSION
            r2 = 0
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_VENDOR
            r2 = 1
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_VENDOR_URL
            r2 = 2
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_HOME
            r2 = 3
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_VM_SPECIFICATION_VERSION
            r2 = 4
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_VM_SPECIFICATION_VENDOR
            r2 = 5
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_VM_SPECIFICATION_NAME
            r2 = 6
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_VM_VERSION
            r2 = 7
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_VM_VENDOR
            r2 = 8
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_VM_NAME
            r2 = 9
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_SPECIFICATION_VERSION
            r2 = 10
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_SPECIFICATION_VENDOR
            r2 = 11
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_SPECIFICATION_NAME
            r2 = 12
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_CLASS_VERSION
            r2 = 13
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_CLASS_PATH
            r2 = 14
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_LIBRARY_PATH
            r2 = 15
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_IO_TMPDIR
            r2 = 16
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_COMPILER
            r2 = 17
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.JAVA_EXT_DIRS
            r2 = 18
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.OS_NAME
            r2 = 19
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.OS_ARCH
            r2 = 20
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.OS_VERSION
            r2 = 21
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.FILE_SEPARATOR
            r2 = 22
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.PATH_SEPARATOR
            r2 = 23
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.LINE_SEPARATOR
            r2 = 24
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.USER_NAME
            r2 = 25
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.USER_HOME
            r2 = 26
            r0[r2] = r1
            com.google.common.base.StandardSystemProperty r1 = com.google.common.base.StandardSystemProperty.USER_DIR
            r2 = 27
            r0[r2] = r1
            return r0
    }

    static {
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_VERSION"
            r2 = 0
            java.lang.String r3 = "java.version"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_VERSION = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_VENDOR"
            r2 = 1
            java.lang.String r3 = "java.vendor"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_VENDOR = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_VENDOR_URL"
            r2 = 2
            java.lang.String r3 = "java.vendor.url"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_VENDOR_URL = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_HOME"
            r2 = 3
            java.lang.String r3 = "java.home"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_HOME = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_VM_SPECIFICATION_VERSION"
            r2 = 4
            java.lang.String r3 = "java.vm.specification.version"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_VM_SPECIFICATION_VERSION = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_VM_SPECIFICATION_VENDOR"
            r2 = 5
            java.lang.String r3 = "java.vm.specification.vendor"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_VM_SPECIFICATION_VENDOR = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_VM_SPECIFICATION_NAME"
            r2 = 6
            java.lang.String r3 = "java.vm.specification.name"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_VM_SPECIFICATION_NAME = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_VM_VERSION"
            r2 = 7
            java.lang.String r3 = "java.vm.version"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_VM_VERSION = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_VM_VENDOR"
            r2 = 8
            java.lang.String r3 = "java.vm.vendor"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_VM_VENDOR = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_VM_NAME"
            r2 = 9
            java.lang.String r3 = "java.vm.name"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_VM_NAME = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_SPECIFICATION_VERSION"
            r2 = 10
            java.lang.String r3 = "java.specification.version"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_SPECIFICATION_VERSION = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_SPECIFICATION_VENDOR"
            r2 = 11
            java.lang.String r3 = "java.specification.vendor"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_SPECIFICATION_VENDOR = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_SPECIFICATION_NAME"
            r2 = 12
            java.lang.String r3 = "java.specification.name"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_SPECIFICATION_NAME = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_CLASS_VERSION"
            r2 = 13
            java.lang.String r3 = "java.class.version"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_CLASS_VERSION = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_CLASS_PATH"
            r2 = 14
            java.lang.String r3 = "java.class.path"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_CLASS_PATH = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_LIBRARY_PATH"
            r2 = 15
            java.lang.String r3 = "java.library.path"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_LIBRARY_PATH = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_IO_TMPDIR"
            r2 = 16
            java.lang.String r3 = "java.io.tmpdir"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_IO_TMPDIR = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_COMPILER"
            r2 = 17
            java.lang.String r3 = "java.compiler"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_COMPILER = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "JAVA_EXT_DIRS"
            r2 = 18
            java.lang.String r3 = "java.ext.dirs"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.JAVA_EXT_DIRS = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "OS_NAME"
            r2 = 19
            java.lang.String r3 = "os.name"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.OS_NAME = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "OS_ARCH"
            r2 = 20
            java.lang.String r3 = "os.arch"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.OS_ARCH = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "OS_VERSION"
            r2 = 21
            java.lang.String r3 = "os.version"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.OS_VERSION = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "FILE_SEPARATOR"
            r2 = 22
            java.lang.String r3 = "file.separator"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.FILE_SEPARATOR = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "PATH_SEPARATOR"
            r2 = 23
            java.lang.String r3 = "path.separator"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.PATH_SEPARATOR = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "LINE_SEPARATOR"
            r2 = 24
            java.lang.String r3 = "line.separator"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.LINE_SEPARATOR = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "USER_NAME"
            r2 = 25
            java.lang.String r3 = "user.name"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.USER_NAME = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "USER_HOME"
            r2 = 26
            java.lang.String r3 = "user.home"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.USER_HOME = r0
            com.google.common.base.StandardSystemProperty r0 = new com.google.common.base.StandardSystemProperty
            java.lang.String r1 = "USER_DIR"
            r2 = 27
            java.lang.String r3 = "user.dir"
            r0.<init>(r1, r2, r3)
            com.google.common.base.StandardSystemProperty.USER_DIR = r0
            com.google.common.base.StandardSystemProperty[] r0 = $values()
            com.google.common.base.StandardSystemProperty.$VALUES = r0
            return
    }

    private StandardSystemProperty(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.key = r3
            return
    }

    public static com.google.common.base.StandardSystemProperty valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.base.StandardSystemProperty> r0 = com.google.common.base.StandardSystemProperty.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.base.StandardSystemProperty r1 = (com.google.common.base.StandardSystemProperty) r1
            return r1
    }

    public static com.google.common.base.StandardSystemProperty[] values() {
            com.google.common.base.StandardSystemProperty[] r0 = com.google.common.base.StandardSystemProperty.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.base.StandardSystemProperty[] r0 = (com.google.common.base.StandardSystemProperty[]) r0
            return r0
    }

    public java.lang.String key() {
            r1 = this;
            java.lang.String r0 = r1.key
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.key()
            java.lang.String r1 = r4.value()
            r2 = 1
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r2)
            int r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r1, r2)
            java.lang.String r3 = "="
            java.lang.String r0 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r2, r0, r3, r1)
            return r0
    }

    @javax.annotation.CheckForNull
    public java.lang.String value() {
            r1 = this;
            java.lang.String r0 = r1.key
            java.lang.String r0 = java.lang.System.getProperty(r0)
            return r0
    }
}
