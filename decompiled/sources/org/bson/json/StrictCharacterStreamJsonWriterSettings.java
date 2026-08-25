package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
public final class StrictCharacterStreamJsonWriterSettings {
    private final boolean indent;
    private final java.lang.String indentCharacters;
    private final int maxLength;
    private final java.lang.String newLineCharacters;

    /* JADX INFO: renamed from: org.bson.json.StrictCharacterStreamJsonWriterSettings$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private boolean indent;
        private java.lang.String indentCharacters;
        private int maxLength;
        private java.lang.String newLineCharacters;

        private Builder() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "line.separator"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                r1.newLineCharacters = r0
                java.lang.String r0 = "  "
                r1.indentCharacters = r0
                return
        }

        public /* synthetic */ Builder(org.bson.json.StrictCharacterStreamJsonWriterSettings.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ boolean access$100(org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder r0) {
                boolean r0 = r0.indent
                return r0
        }

        public static /* synthetic */ java.lang.String access$200(org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder r0) {
                java.lang.String r0 = r0.newLineCharacters
                return r0
        }

        public static /* synthetic */ java.lang.String access$300(org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder r0) {
                java.lang.String r0 = r0.indentCharacters
                return r0
        }

        public static /* synthetic */ int access$400(org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder r0) {
                int r0 = r0.maxLength
                return r0
        }

        public org.bson.json.StrictCharacterStreamJsonWriterSettings build() {
                r2 = this;
                org.bson.json.StrictCharacterStreamJsonWriterSettings r0 = new org.bson.json.StrictCharacterStreamJsonWriterSettings
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder indent(boolean r1) {
                r0 = this;
                r0.indent = r1
                return r0
        }

        public org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder indentCharacters(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "indentCharacters"
                org.bson.assertions.Assertions.notNull(r0, r2)
                r1.indentCharacters = r2
                return r1
        }

        public org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder maxLength(int r1) {
                r0 = this;
                r0.maxLength = r1
                return r0
        }

        public org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder newLineCharacters(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "newLineCharacters"
                org.bson.assertions.Assertions.notNull(r0, r2)
                r1.newLineCharacters = r2
                return r1
        }
    }

    private StrictCharacterStreamJsonWriterSettings(org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder.access$100(r2)
            r1.indent = r0
            java.lang.String r0 = org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder.access$200(r2)
            if (r0 == 0) goto L14
            java.lang.String r0 = org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder.access$200(r2)
            goto L1a
        L14:
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)
        L1a:
            r1.newLineCharacters = r0
            java.lang.String r0 = org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder.access$300(r2)
            r1.indentCharacters = r0
            int r2 = org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder.access$400(r2)
            r1.maxLength = r2
            return
    }

    public /* synthetic */ StrictCharacterStreamJsonWriterSettings(org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder r1, org.bson.json.StrictCharacterStreamJsonWriterSettings.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static org.bson.json.StrictCharacterStreamJsonWriterSettings.Builder builder() {
            org.bson.json.StrictCharacterStreamJsonWriterSettings$Builder r0 = new org.bson.json.StrictCharacterStreamJsonWriterSettings$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public java.lang.String getIndentCharacters() {
            r1 = this;
            java.lang.String r0 = r1.indentCharacters
            return r0
    }

    public int getMaxLength() {
            r1 = this;
            int r0 = r1.maxLength
            return r0
    }

    public java.lang.String getNewLineCharacters() {
            r1 = this;
            java.lang.String r0 = r1.newLineCharacters
            return r0
    }

    public boolean isIndent() {
            r1 = this;
            boolean r0 = r1.indent
            return r0
    }
}
