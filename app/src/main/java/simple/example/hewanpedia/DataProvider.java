package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anggrek;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kaktus;
import simple.example.hewanpedia.model.Mawar;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Anggrek> initDataAngrek(Context ctx) {
        List<Anggrek> Anggreks = new ArrayList<>();
        Anggreks.add(new Anggrek(ctx.getString(R.string.diuris_nama),ctx.getString(R.string.diuris_asal),ctx.getString(R.string.diuris_deskripsi), R.drawable.anggrek1));
        Anggreks.add(new Anggrek(ctx.getString(R.string.hitam_nama),ctx.getString(R.string.hitam_asal),ctx.getString(R.string.hitam_deskripsi), R.drawable.anggrek2));
        Anggreks.add(new Anggrek(ctx.getString(R.string.vanilla_nama),ctx.getString(R.string.vanilla_asal),ctx.getString(R.string.vanilla_deskripsi), R.drawable.anggrek3));
        Anggreks.add(new Anggrek(ctx.getString(R.string.dewa_nama),ctx.getString(R.string.dewa_asal),ctx.getString(R.string.dewa_deskripsi), R.drawable.anggrek4));
        return Anggreks;
    }

    private static List<Kaktus> initDataKaktus(Context ctx) {
        List<Kaktus> Kaktuss = new ArrayList<>();
        Kaktuss.add(new Kaktus(ctx.getString(R.string.salju_nama),ctx.getString(R.string.salju_asal),ctx.getString(R.string.salju_deskripsi), R.drawable.kaktus1));
        Kaktuss.add(new Kaktus(ctx.getString(R.string.kubis_nama),ctx.getString(R.string.kubis_asal),ctx.getString(R.string.kubis_deskripsi), R.drawable.kaktus2));
        Kaktuss.add(new Kaktus(ctx.getString(R.string.kursimertua_nama),ctx.getString(R.string.kursimertua_asal),ctx.getString(R.string.kursimertua_deskripsi), R.drawable.kaktus3));
        return Kaktuss;
    }

    private static List<Mawar> initDataMawar(Context ctx) {
        List<Mawar> mawars = new ArrayList<>();
        mawars.add(new Mawar(ctx.getString(R.string.merah_nama),ctx.getString(R.string.merah_asal),ctx.getString(R.string.merah_deskripsi), R.drawable.mawar1));
        mawars.add(new Mawar(ctx.getString(R.string.peace_nama),ctx.getString(R.string.peace_asal),ctx.getString(R.string.peace_deskripsi), R.drawable.mawar2));
        mawars.add(new Mawar(ctx.getString(R.string.ratuelizabet_nama),ctx.getString(R.string.ratuelizabet_asal),ctx.getString(R.string.ratuelizabet_deskripsi), R.drawable.mawar3));
        mawars.add(new Mawar(ctx.getString(R.string.ratumalam_nama),ctx.getString(R.string.ratumalam_nama),ctx.getString(R.string.ratumalam_deskripsi), R.drawable.mawar4));
        return mawars;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKaktus(ctx));
        hewans.addAll(initDataMawar(ctx));
        hewans.addAll(initDataAngrek(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
