package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes3.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
interface ServiceManagerBridge {
    com.google.common.collect.ImmutableMultimap<com.google.common.util.concurrent.Service.State, com.google.common.util.concurrent.Service> servicesByState();
}
