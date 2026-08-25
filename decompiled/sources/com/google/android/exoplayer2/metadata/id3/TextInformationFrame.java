package com.google.android.exoplayer2.metadata.id3;

/* JADX INFO: loaded from: classes3.dex */
public final class TextInformationFrame extends com.google.android.exoplayer2.metadata.id3.Id3Frame {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.id3.TextInformationFrame> CREATOR = null;

    @androidx.annotation.Nullable
    public final java.lang.String description;

    @java.lang.Deprecated
    public final java.lang.String value;
    public final com.google.common.collect.ImmutableList<java.lang.String> values;


    static {
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame$1 r0 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame$1
            r0.<init>()
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame.CREATOR = r0
            return
    }

    private TextInformationFrame(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = r3.readString()
            java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r3.readString()
            java.lang.String[] r3 = r3.createStringArray()
            java.lang.Object r3 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.copyOf(r3)
            r2.<init>(r0, r1, r3)
            return
    }

    public /* synthetic */ TextInformationFrame(android.os.Parcel r1, com.google.android.exoplayer2.metadata.id3.TextInformationFrame.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(id, description, ImmutableList.of(value))")
    @java.lang.Deprecated
    public TextInformationFrame(java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, java.lang.String r3) {
            r0 = this;
            com.google.common.collect.ImmutableList r3 = com.google.common.collect.ImmutableList.of(r3)
            r0.<init>(r1, r2, r3)
            return
    }

    public TextInformationFrame(java.lang.String r1, @androidx.annotation.Nullable java.lang.String r2, java.util.List<java.lang.String> r3) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r3.isEmpty()
            r1 = r1 ^ 1
            com.google.android.exoplayer2.util.Assertions.checkArgument(r1)
            r0.description = r2
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r3)
            r0.values = r1
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.value = r1
            return
    }

    private static java.util.List<java.lang.Integer> parseId3v2point4TimestampFrameForDate(java.lang.String r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length()     // Catch: java.lang.NumberFormatException -> L7c
            r2 = 5
            r3 = 10
            r4 = 7
            r5 = 0
            r6 = 4
            if (r1 < r3) goto L41
            java.lang.String r1 = r7.substring(r5, r6)     // Catch: java.lang.NumberFormatException -> L7c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L7c
            r0.add(r1)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.String r1 = r7.substring(r2, r4)     // Catch: java.lang.NumberFormatException -> L7c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L7c
            r0.add(r1)     // Catch: java.lang.NumberFormatException -> L7c
            r1 = 8
            java.lang.String r7 = r7.substring(r1, r3)     // Catch: java.lang.NumberFormatException -> L7c
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L7c
            r0.add(r7)     // Catch: java.lang.NumberFormatException -> L7c
            goto L7b
        L41:
            int r1 = r7.length()     // Catch: java.lang.NumberFormatException -> L7c
            if (r1 < r4) goto L66
            java.lang.String r1 = r7.substring(r5, r6)     // Catch: java.lang.NumberFormatException -> L7c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L7c
            r0.add(r1)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.String r7 = r7.substring(r2, r4)     // Catch: java.lang.NumberFormatException -> L7c
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L7c
            r0.add(r7)     // Catch: java.lang.NumberFormatException -> L7c
            goto L7b
        L66:
            int r1 = r7.length()     // Catch: java.lang.NumberFormatException -> L7c
            if (r1 < r6) goto L7b
            java.lang.String r7 = r7.substring(r5, r6)     // Catch: java.lang.NumberFormatException -> L7c
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L7c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L7c
            r0.add(r7)     // Catch: java.lang.NumberFormatException -> L7c
        L7b:
            return r0
        L7c:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            return r7
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L33
            java.lang.Class<com.google.android.exoplayer2.metadata.id3.TextInformationFrame> r2 = com.google.android.exoplayer2.metadata.id3.TextInformationFrame.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L33
        L10:
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r5 = (com.google.android.exoplayer2.metadata.id3.TextInformationFrame) r5
            java.lang.String r2 = r4.id
            java.lang.String r3 = r5.id
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.description
            java.lang.String r3 = r5.description
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L31
            com.google.common.collect.ImmutableList<java.lang.String> r2 = r4.values
            com.google.common.collect.ImmutableList<java.lang.String> r5 = r5.values
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L31
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
        L33:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.id
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            java.lang.String r1 = r3.description
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            goto L14
        L13:
            r1 = 0
        L14:
            int r0 = r0 + r1
            int r0 = r0 * 31
            com.google.common.collect.ImmutableList<java.lang.String> r1 = r3.values
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r9) {
            r8 = this;
            java.lang.String r0 = r8.id
            java.util.Objects.requireNonNull(r0)
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = -1
            switch(r1) {
                case 82815: goto L125;
                case 82878: goto L11a;
                case 82897: goto L10f;
                case 83253: goto L104;
                case 83254: goto Lf9;
                case 83255: goto Lee;
                case 83341: goto Le3;
                case 83378: goto Ld8;
                case 83536: goto Lca;
                case 83552: goto Lbc;
                case 2567331: goto Lae;
                case 2569357: goto La0;
                case 2569891: goto L92;
                case 2570401: goto L84;
                case 2570410: goto L76;
                case 2571565: goto L68;
                case 2575251: goto L5a;
                case 2581512: goto L4c;
                case 2581513: goto L3e;
                case 2581514: goto L30;
                case 2583398: goto L22;
                case 2590194: goto L14;
                default: goto L12;
            }
        L12:
            goto L12f
        L14:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L12f
        L1e:
            r7 = 21
            goto L12f
        L22:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            goto L12f
        L2c:
            r7 = 20
            goto L12f
        L30:
            java.lang.String r1 = "TPE3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3a
            goto L12f
        L3a:
            r7 = 19
            goto L12f
        L3e:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L12f
        L48:
            r7 = 18
            goto L12f
        L4c:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            goto L12f
        L56:
            r7 = 17
            goto L12f
        L5a:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L64
            goto L12f
        L64:
            r7 = 16
            goto L12f
        L68:
            java.lang.String r1 = "TEXT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L72
            goto L12f
        L72:
            r7 = 15
            goto L12f
        L76:
            java.lang.String r1 = "TDRL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L80
            goto L12f
        L80:
            r7 = 14
            goto L12f
        L84:
            java.lang.String r1 = "TDRC"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8e
            goto L12f
        L8e:
            r7 = 13
            goto L12f
        L92:
            java.lang.String r1 = "TDAT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9c
            goto L12f
        L9c:
            r7 = 12
            goto L12f
        La0:
            java.lang.String r1 = "TCOM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Laa
            goto L12f
        Laa:
            r7 = 11
            goto L12f
        Lae:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb8
            goto L12f
        Lb8:
            r7 = 10
            goto L12f
        Lbc:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lc6
            goto L12f
        Lc6:
            r7 = 9
            goto L12f
        Lca:
            java.lang.String r1 = "TXT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld4
            goto L12f
        Ld4:
            r7 = 8
            goto L12f
        Ld8:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Le1
            goto L12f
        Le1:
            r7 = 7
            goto L12f
        Le3:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lec
            goto L12f
        Lec:
            r7 = 6
            goto L12f
        Lee:
            java.lang.String r1 = "TP3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lf7
            goto L12f
        Lf7:
            r7 = 5
            goto L12f
        Lf9:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L102
            goto L12f
        L102:
            r7 = 4
            goto L12f
        L104:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10d
            goto L12f
        L10d:
            r7 = 3
            goto L12f
        L10f:
            java.lang.String r1 = "TDA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L118
            goto L12f
        L118:
            r7 = 2
            goto L12f
        L11a:
            java.lang.String r1 = "TCM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L123
            goto L12f
        L123:
            r7 = 1
            goto L12f
        L125:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12e
            goto L12f
        L12e:
            r7 = 0
        L12f:
            switch(r7) {
                case 0: goto L254;
                case 1: goto L248;
                case 2: goto L220;
                case 3: goto L214;
                case 4: goto L208;
                case 5: goto L1fc;
                case 6: goto L1cd;
                case 7: goto L1c0;
                case 8: goto L1b3;
                case 9: goto L19e;
                case 10: goto L254;
                case 11: goto L248;
                case 12: goto L220;
                case 13: goto L169;
                case 14: goto L134;
                case 15: goto L1b3;
                case 16: goto L1c0;
                case 17: goto L214;
                case 18: goto L208;
                case 19: goto L1fc;
                case 20: goto L1cd;
                case 21: goto L19e;
                default: goto L132;
            }
        L132:
            goto L25f
        L134:
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.values
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = parseId3v2point4TimestampFrameForDate(r0)
            int r1 = r0.size()
            if (r1 == r5) goto L15e
            if (r1 == r4) goto L155
            if (r1 == r3) goto L14c
            goto L25f
        L14c:
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.setReleaseDay(r1)
        L155:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.setReleaseMonth(r1)
        L15e:
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.setReleaseYear(r0)
            goto L25f
        L169:
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.values
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = parseId3v2point4TimestampFrameForDate(r0)
            int r1 = r0.size()
            if (r1 == r5) goto L193
            if (r1 == r4) goto L18a
            if (r1 == r3) goto L181
            goto L25f
        L181:
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.setRecordingDay(r1)
        L18a:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.setRecordingMonth(r1)
        L193:
            java.lang.Object r0 = r0.get(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.setRecordingYear(r0)
            goto L25f
        L19e:
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.values     // Catch: java.lang.Throwable -> L25f
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L25f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L25f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L25f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L25f
            r9.setRecordingYear(r0)     // Catch: java.lang.Throwable -> L25f
            goto L25f
        L1b3:
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.values
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.setWriter(r0)
            goto L25f
        L1c0:
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.values
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.setTitle(r0)
            goto L25f
        L1cd:
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.values
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "/"
            java.lang.String[] r0 = com.google.android.exoplayer2.util.Util.split(r0, r1)
            r1 = r0[r6]     // Catch: java.lang.Throwable -> L25f
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L25f
            int r2 = r0.length     // Catch: java.lang.Throwable -> L25f
            if (r2 <= r5) goto L1ef
            r0 = r0[r5]     // Catch: java.lang.Throwable -> L25f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L25f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L25f
            goto L1f0
        L1ef:
            r0 = 0
        L1f0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L25f
            com.google.android.exoplayer2.MediaMetadata$Builder r9 = r9.setTrackNumber(r1)     // Catch: java.lang.Throwable -> L25f
            r9.setTotalTrackCount(r0)     // Catch: java.lang.Throwable -> L25f
            goto L25f
        L1fc:
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.values
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.setConductor(r0)
            goto L25f
        L208:
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.values
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.setAlbumArtist(r0)
            goto L25f
        L214:
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.values
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.setArtist(r0)
            goto L25f
        L220:
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.values     // Catch: java.lang.Throwable -> L25f
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L25f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L25f
            java.lang.String r1 = r0.substring(r4, r2)     // Catch: java.lang.Throwable -> L25f
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L25f
            java.lang.String r0 = r0.substring(r6, r4)     // Catch: java.lang.Throwable -> L25f
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L25f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L25f
            com.google.android.exoplayer2.MediaMetadata$Builder r9 = r9.setRecordingMonth(r1)     // Catch: java.lang.Throwable -> L25f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L25f
            r9.setRecordingDay(r0)     // Catch: java.lang.Throwable -> L25f
            goto L25f
        L248:
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.values
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.setComposer(r0)
            goto L25f
        L254:
            com.google.common.collect.ImmutableList<java.lang.String> r0 = r8.values
            java.lang.Object r0 = r0.get(r6)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.setAlbumTitle(r0)
        L25f:
            return
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.id
            r0.append(r1)
            java.lang.String r1 = ": description="
            r0.append(r1)
            java.lang.String r1 = r2.description
            r0.append(r1)
            java.lang.String r1 = ": values="
            r0.append(r1)
            com.google.common.collect.ImmutableList<java.lang.String> r1 = r2.values
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.String r3 = r1.id
            r2.writeString(r3)
            java.lang.String r3 = r1.description
            r2.writeString(r3)
            com.google.common.collect.ImmutableList<java.lang.String> r3 = r1.values
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r2.writeStringArray(r3)
            return
    }
}
