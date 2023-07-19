package com.example.demo.config;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum CompanyLogo {
    C1("AJ네트웍스", "aj.png"),
    C2("AK홀딩스", "ak-holdings.png"),
    C3("알테오젠", "alteogen.png"),
    C4("CJ", "cj.png"),
    C5("CJ CGV", "cgv.png"),
    C6("CJ4우(전환)", "cj.png"),
    C7("CJ대한통운", "cj.png"),
    C8("CJ씨푸드", "cj.png"),
    C9("CJ씨푸드1우", "cj.png"),
    C10("CJ우", "cj.png"),
    C11("CJ제일제당", "cj.png"),
    C12("CJ제일제당 우", "cj.png"),
    C13("CJ ENM", "cj.png"),
    C14("CJ 바이오사이언스", "cj.png"),
    C15("CJ프레시웨이", "cj.png"),
    C16("BYC", "byc.png"),
    C17("BYC우", "byc.png"),
    C18("BNK금융지주", "bnk.png"),
    C19("BGF", "bgf.png"),
    C20("BGF리테일", "bgf-retail.png"),
    C21("DB", "db.png"),
    C22("DB금융투자", "db.png"),
    C23("DB손해보험", "db.png"),
    C24("DB하이텍", "db.png"),
    C25("DB하이텍1우", "db.png"),
    C26("LG유플러스", "lguplus.png"),
    C27("LG에너지솔루션", "lg.png"),
    C28("LG전자", "lg.png"),
    C29("LG이노텍", "lg.png"),
    C30("LG화학", "lg.png"),
    C31("LG화학우", "lg.png"),
    C32("LG생활건강", "lg.png"),
    C33("LG생활건강우", "lg.png"),
    C34("KT", "kt.png"),
    C35("KCC", "kcc.png"),
    C36("KT&G", "ktng.png"),
    C37("F&F", "fnfholdings.png"),
    C38("F&F홀딩스", "fnfholdings.png"),
    C39("DL건설", "dlconstruction.png"),
    C40("HDC", "hdc.png"),
    C41("HDC랩스", "hdc.png"),
    C42("한국철강", "kisco.png"),
    C43("GS글로벌", "gs.png"),
    C44("DRB동일", "drbworld.png"),
    C45("카카오게임즈", "kakaogames.png"),
    C46("위메이드", "wemade.png"),
    C47("ESR켄달스퀘어리츠", "esrks-reit.png"),
    C48("펄어비스", "pearlabyss.png"),
    C49("파라다이스", "paradise.png"),
    C50("인선이엔티", "insun.png"),
    C51("E1", "e1.png"),
    C52("GS리테일", "gs.png"),
    C53("GS", "gs.png"),
    C54("엘앤에프", "landf.png"),
    C55("엔켐", "enchem.png"),
    C56("GS건설", "gs.png"),
    C57("DI동일", "dong-il.png"),
    C58("우리기술투자", "wooricapital.png"),
    C59("오스코텍", "oscotec.png"),
    C60("씨젠", "seegene.png"),
    C61("엔케이맥스", "nkmax.png"),
    C62("한국비엔씨", "bnckorea.png"),
    C63("DSR제강", "dsr.png"),
    C64("에코프로비엠", "echoprobm.png"),
    C65("에코프로", "echopro.png"),
    C66("에코프로에이치엔", "echopro.png"),
    C67("DSR", "dsr.png"),
    C68("씨아이에스", "cisro.png"),
    C69("성우하이텍", "swhitech.png"),
    C70("서진시스템", "seojinsystem.png"),
    C71("에스엠", "sm.png"),
    C72("엘앤씨바이오", "lncbio.png"),
    C73("심텍", "simmtech.png"),
    C74("덕산네오룩스", "dsnl.png"),
    C75("알테오젠", "alteogen.png"),
    C76("셀리버리", "cellivery.png"),
    C77("메지온", "mezzion.png"),
    C78("에스앤에스텍", "snstech.png"),
    C79("대주전자재료", "daejoo.png"),
    C80("두산테스나", "doosan-tesna.png"),
    C81("바이오니아", "bioneer.png"),
    C82("국일제지", "kukilpaper.png"),
    C83("네이처셀", "naturecell.png"),
    C84("셀트리온", "celltrion.png"),
    C85("SFA반도체", "celltrion.png"),
    C86("휴마시스", "humasis.png"),
    C87("YG PLUS", "ygplus.png"),
    C88("포스코엠텍", "poscomtech.png"),
    C89("POSCO홀딩스", "poscoholdings.png"),
    C90("코스모신소재", "cosmoamt.png"),
    C91("팬오션", "panocean.png"),
    C92("이수페타시스", "petasys.png"),
    C93("코스맥스", "cosmax.png"),
    C94("진성티이씨", "jinsungtec.png"),
    C95("이연제약", "reyonpharm.png"),
    C96("원익IPS", "ips.png"),
    C97("인탑스", "intops.png"),
    C98("와이지엔터테인먼트", "ygfamily.png"),
    C99("원익홀딩스", "wonikholdings.png"),
    C100("코스모화학", "cosmochem.png"),
    C101("원익QnC", "wonikqnc.png"),
    C102("에프에스티", "fstc.png"),
    C103("강원랜드", "kangwonland.png"),
    C104("원익피앤이", "pnesolution.png"),
    C105("아난티", "ananti.png"),
    C106("리노공업", "leeno.png"),
    C107("뉴지랩파마", "newglab.png"),
    C108("다원시스", "dawonsys.png"),
    C109("에스티큐브", "stcube.png"),
    C110("아이에스동서", "isdongseo.png"),
    C111("시너지이노베이션", "synergyinno"),
    C112("강남제비스코", "jevisco.png"),
    C113("HL만도", "hlmando.png"),
    C114("동진쎄미켐", "dongjin.png"),
    C115("넥스틴", "nextinsol.png"),
    C116("범한퓨얼셀", "bumhanfuelcell.png"),
    C117("레이크머티리얼즈", "lakeled.png"),
    C118("강원에너지", "kwenergy.png"),
    C119("아우딘퓨쳐스", "outinco.png"),
    C120("금양", "kyc.png"),

    ;
    String name;
    String imageName;

    CompanyLogo(String name, String imageName) {
        this.name = name;
        this.imageName = imageName;
    }

    public static List<String> getTotalNames() {
        return Arrays.stream(values())
                .map(e -> e.name)
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public String getImageName() {
        return imageName;
    }
}
