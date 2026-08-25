package com.google.android.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
abstract class Atom {
    public static final int DEFINES_LARGE_SIZE = 1;
    public static final int EXTENDS_TO_END_SIZE = 0;
    public static final int FULL_HEADER_SIZE = 12;
    public static final int HEADER_SIZE = 8;
    public static final int LONG_HEADER_SIZE = 16;
    public static final int TYPE_H263 = 1211250227;
    public static final int TYPE_Opus = 1332770163;
    public static final int TYPE_TTML = 1414810956;
    public static final int TYPE__mp2 = 778924082;
    public static final int TYPE__mp3 = 778924083;
    public static final int TYPE_ac_3 = 1633889587;
    public static final int TYPE_ac_4 = 1633889588;
    public static final int TYPE_alac = 1634492771;
    public static final int TYPE_alaw = 1634492791;
    public static final int TYPE_av01 = 1635135537;
    public static final int TYPE_av1C = 1635135811;
    public static final int TYPE_avc1 = 1635148593;
    public static final int TYPE_avc3 = 1635148595;
    public static final int TYPE_avcC = 1635148611;
    public static final int TYPE_c608 = 1664495672;
    public static final int TYPE_camm = 1667329389;
    public static final int TYPE_clli = 1668050025;
    public static final int TYPE_co64 = 1668232756;
    public static final int TYPE_colr = 1668246642;
    public static final int TYPE_ctts = 1668576371;
    public static final int TYPE_d263 = 1681012275;
    public static final int TYPE_dOps = 1682927731;
    public static final int TYPE_dac3 = 1684103987;
    public static final int TYPE_dac4 = 1684103988;
    public static final int TYPE_data = 1684108385;
    public static final int TYPE_ddts = 1684305011;
    public static final int TYPE_dec3 = 1684366131;
    public static final int TYPE_dfLa = 1684425825;
    public static final int TYPE_dmlp = 1684892784;
    public static final int TYPE_dtsc = 1685353315;
    public static final int TYPE_dtse = 1685353317;
    public static final int TYPE_dtsh = 1685353320;
    public static final int TYPE_dtsl = 1685353324;
    public static final int TYPE_dtsx = 1685353336;
    public static final int TYPE_dva1 = 1685479729;
    public static final int TYPE_dvav = 1685479798;
    public static final int TYPE_dvcC = 1685480259;
    public static final int TYPE_dvh1 = 1685481521;
    public static final int TYPE_dvhe = 1685481573;
    public static final int TYPE_dvvC = 1685485123;
    public static final int TYPE_ec_3 = 1700998451;
    public static final int TYPE_edts = 1701082227;
    public static final int TYPE_elst = 1701606260;
    public static final int TYPE_emsg = 1701671783;
    public static final int TYPE_enca = 1701733217;
    public static final int TYPE_encv = 1701733238;
    public static final int TYPE_esds = 1702061171;
    public static final int TYPE_fLaC = 1716281667;
    public static final int TYPE_frma = 1718775137;
    public static final int TYPE_ftyp = 1718909296;
    public static final int TYPE_hdlr = 1751411826;
    public static final int TYPE_hev1 = 1751479857;
    public static final int TYPE_hvc1 = 1752589105;
    public static final int TYPE_hvcC = 1752589123;
    public static final int TYPE_ilst = 1768715124;
    public static final int TYPE_keys = 1801812339;
    public static final int TYPE_lpcm = 1819304813;
    public static final int TYPE_m1v_ = 1831958048;
    public static final int TYPE_mdat = 1835295092;
    public static final int TYPE_mdcv = 1835295606;
    public static final int TYPE_mdhd = 1835296868;
    public static final int TYPE_mdia = 1835297121;
    public static final int TYPE_mean = 1835360622;
    public static final int TYPE_mehd = 1835362404;
    public static final int TYPE_meta = 1835365473;
    public static final int TYPE_mett = 1835365492;
    public static final int TYPE_mha1 = 1835557169;
    public static final int TYPE_mhaC = 1835557187;
    public static final int TYPE_mhm1 = 1835560241;
    public static final int TYPE_minf = 1835626086;
    public static final int TYPE_mlpa = 1835823201;
    public static final int TYPE_moof = 1836019558;
    public static final int TYPE_moov = 1836019574;
    public static final int TYPE_mp4a = 1836069985;
    public static final int TYPE_mp4v = 1836070006;
    public static final int TYPE_mpvd = 1836086884;
    public static final int TYPE_mvex = 1836475768;
    public static final int TYPE_mvhd = 1836476516;
    public static final int TYPE_name = 1851878757;
    public static final int TYPE_pasp = 1885434736;
    public static final int TYPE_proj = 1886547818;
    public static final int TYPE_pssh = 1886614376;
    public static final int TYPE_s263 = 1932670515;
    public static final int TYPE_saio = 1935763823;
    public static final int TYPE_saiz = 1935763834;
    public static final int TYPE_samr = 1935764850;
    public static final int TYPE_saut = 1935766900;
    public static final int TYPE_sawb = 1935767394;
    public static final int TYPE_sbgp = 1935828848;
    public static final int TYPE_schi = 1935894633;
    public static final int TYPE_schm = 1935894637;
    public static final int TYPE_senc = 1936027235;
    public static final int TYPE_sgpd = 1936158820;
    public static final int TYPE_sidx = 1936286840;
    public static final int TYPE_sinf = 1936289382;
    public static final int TYPE_smta = 1936553057;
    public static final int TYPE_sowt = 1936684916;
    public static final int TYPE_st3d = 1936995172;
    public static final int TYPE_stbl = 1937007212;
    public static final int TYPE_stco = 1937007471;
    public static final int TYPE_stpp = 1937010800;
    public static final int TYPE_stsc = 1937011555;
    public static final int TYPE_stsd = 1937011556;
    public static final int TYPE_stss = 1937011571;
    public static final int TYPE_stsz = 1937011578;
    public static final int TYPE_stts = 1937011827;
    public static final int TYPE_stz2 = 1937013298;
    public static final int TYPE_sv3d = 1937126244;
    public static final int TYPE_tenc = 1952804451;
    public static final int TYPE_tfdt = 1952867444;
    public static final int TYPE_tfhd = 1952868452;
    public static final int TYPE_tkhd = 1953196132;
    public static final int TYPE_traf = 1953653094;
    public static final int TYPE_trak = 1953653099;
    public static final int TYPE_trex = 1953654136;
    public static final int TYPE_trun = 1953658222;
    public static final int TYPE_twos = 1953984371;
    public static final int TYPE_tx3g = 1954034535;
    public static final int TYPE_udta = 1969517665;
    public static final int TYPE_udts = 1969517683;
    public static final int TYPE_ulaw = 1970037111;
    public static final int TYPE_uuid = 1970628964;
    public static final int TYPE_vp08 = 1987063864;
    public static final int TYPE_vp09 = 1987063865;
    public static final int TYPE_vpcC = 1987076931;
    public static final int TYPE_wave = 2002876005;
    public static final int TYPE_wvtt = 2004251764;
    public final int type;

    /* JADX INFO: loaded from: classes3.dex */
    public static final class ContainerAtom extends com.google.android.exoplayer2.extractor.mp4.Atom {
        public final java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom> containerChildren;
        public final long endPosition;
        public final java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom> leafChildren;

        public ContainerAtom(int r1, long r2) {
                r0 = this;
                r0.<init>(r1)
                r0.endPosition = r2
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.leafChildren = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.containerChildren = r1
                return
        }

        public void add(com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom r2) {
                r1 = this;
                java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r1.containerChildren
                r0.add(r2)
                return
        }

        public void add(com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom r2) {
                r1 = this;
                java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r0 = r1.leafChildren
                r0.add(r2)
                return
        }

        public int getChildAtomOfTypeCount(int r6) {
                r5 = this;
                java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r0 = r5.leafChildren
                int r0 = r0.size()
                r1 = 0
                r2 = 0
                r3 = 0
            L9:
                if (r2 >= r0) goto L1c
                java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r4 = r5.leafChildren
                java.lang.Object r4 = r4.get(r2)
                com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r4 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r4
                int r4 = r4.type
                if (r4 != r6) goto L19
                int r3 = r3 + 1
            L19:
                int r2 = r2 + 1
                goto L9
            L1c:
                java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r5.containerChildren
                int r0 = r0.size()
            L22:
                if (r1 >= r0) goto L35
                java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r2 = r5.containerChildren
                java.lang.Object r2 = r2.get(r1)
                com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r2 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r2
                int r2 = r2.type
                if (r2 != r6) goto L32
                int r3 = r3 + 1
            L32:
                int r1 = r1 + 1
                goto L22
            L35:
                return r3
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom getContainerAtomOfType(int r5) {
                r4 = this;
                java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r0 = r4.containerChildren
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L19
                java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r2 = r4.containerChildren
                java.lang.Object r2 = r2.get(r1)
                com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom r2 = (com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom) r2
                int r3 = r2.type
                if (r3 != r5) goto L16
                return r2
            L16:
                int r1 = r1 + 1
                goto L7
            L19:
                r5 = 0
                return r5
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom getLeafAtomOfType(int r5) {
                r4 = this;
                java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r0 = r4.leafChildren
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L19
                java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r2 = r4.leafChildren
                java.lang.Object r2 = r2.get(r1)
                com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom r2 = (com.google.android.exoplayer2.extractor.mp4.Atom.LeafAtom) r2
                int r3 = r2.type
                if (r3 != r5) goto L16
                return r2
            L16:
                int r1 = r1 + 1
                goto L7
            L19:
                r5 = 0
                return r5
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.Atom
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r2.type
                java.lang.String r1 = com.google.android.exoplayer2.extractor.mp4.Atom.getAtomTypeString(r1)
                r0.append(r1)
                java.lang.String r1 = " leaves: "
                r0.append(r1)
                java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$LeafAtom> r1 = r2.leafChildren
                java.lang.Object[] r1 = r1.toArray()
                java.lang.String r1 = java.util.Arrays.toString(r1)
                r0.append(r1)
                java.lang.String r1 = " containers: "
                r0.append(r1)
                java.util.List<com.google.android.exoplayer2.extractor.mp4.Atom$ContainerAtom> r1 = r2.containerChildren
                java.lang.Object[] r1 = r1.toArray()
                java.lang.String r1 = java.util.Arrays.toString(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class LeafAtom extends com.google.android.exoplayer2.extractor.mp4.Atom {
        public final com.google.android.exoplayer2.util.ParsableByteArray data;

        public LeafAtom(int r1, com.google.android.exoplayer2.util.ParsableByteArray r2) {
                r0 = this;
                r0.<init>(r1)
                r0.data = r2
                return
        }
    }

    public Atom(int r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            return
    }

    public static java.lang.String getAtomTypeString(int r2) {
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r1 = r2 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.append(r1)
            int r1 = r2 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.append(r1)
            int r1 = r2 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            r0.append(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static int parseFullAtomFlags(int r1) {
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            return r1
    }

    public static int parseFullAtomVersion(int r0) {
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.type
            java.lang.String r0 = getAtomTypeString(r0)
            return r0
    }
}
