// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import android.os.Parcel;
import android.os.Parcelable$Creator;

public class zzaq implements Parcelable$Creator<VideoOptionsParcel>
{
    static void zza(final VideoOptionsParcel videoOptionsParcel, final Parcel parcel, final int n) {
        final int zzcr = zzb.zzcr(parcel);
        zzb.zzc(parcel, 1, videoOptionsParcel.versionCode);
        zzb.zza(parcel, 2, videoOptionsParcel.zzbac);
        zzb.zzaj(parcel, zzcr);
    }
    
    public VideoOptionsParcel zzh(final Parcel parcel) {
        boolean zzc = false;
        final int zzcq = zza.zzcq(parcel);
        int zzg = 0;
        while (parcel.dataPosition() < zzcq) {
            final int zzcp = zza.zzcp(parcel);
            switch (zza.zzgv(zzcp)) {
                default: {
                    zza.zzb(parcel, zzcp);
                    continue;
                }
                case 1: {
                    zzg = zza.zzg(parcel, zzcp);
                    continue;
                }
                case 2: {
                    zzc = zza.zzc(parcel, zzcp);
                    continue;
                }
            }
        }
        if (parcel.dataPosition() != zzcq) {
            throw new zza.zza(new StringBuilder(37).append("Overread allowed size end=").append(zzcq).toString(), parcel);
        }
        return new VideoOptionsParcel(zzg, zzc);
    }
    
    public VideoOptionsParcel[] zzx(final int n) {
        return new VideoOptionsParcel[n];
    }
}
