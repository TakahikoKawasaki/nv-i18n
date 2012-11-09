/*
 * Copyright (C) 2012 Neo Visionaries Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.neovisionaries.i18n;


import org.junit.Test;
import static org.junit.Assert.*;
import static com.neovisionaries.i18n.LanguageAlpha3Code.Usage.BIBLIOGRAPHY;
import static com.neovisionaries.i18n.LanguageAlpha3Code.Usage.TERMINOLOGY;
import static com.neovisionaries.i18n.LanguageAlpha3Code.Usage.COMMON;


public class LanguageAlpha3CodeTest
{
    private static LanguageAlpha3Code getByCode(String code)
    {
        return LanguageAlpha3Code.getByCode(code);
    }


    private static LanguageAlpha3Code getByCode(String code, boolean caseSensitive)
    {
        return LanguageAlpha3Code.getByCode(code, caseSensitive);
    }


    @Test
    public void test1()
    {
        assertNull(getByCode(null));
    }


    @Test
    public void test2()
    {
        assertNull(getByCode(""));
    }


    @Test
    public void test3()
    {
        assertNull(getByCode("?"));
    }


    @Test
    public void test4()
    {
        assertNull(getByCode("??"));
    }


    @Test
    public void test5()
    {
        assertNull(getByCode("???"));
    }


    @Test
    public void test6()
    {
        assertNull(getByCode("????"));
    }


    @Test
    public void test7()
    {
        assertEquals(getByCode("jpn"), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test8()
    {
        assertEquals(getByCode("JPN"), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test9()
    {
        assertEquals(getByCode("jpn", true), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test10()
    {
        assertNull(getByCode("JPN", true));
    }


    @Test
    public void test11()
    {
        assertEquals(getByCode("jpn", false), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test12()
    {
        assertEquals(getByCode("JPN", false), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test13()
    {
        assertEquals(getByCode("he"), LanguageAlpha3Code.heb);
    }


    @Test
    public void test14()
    {
        assertEquals(getByCode("iw"), LanguageAlpha3Code.heb);
    }


    @Test
    public void test15()
    {
        assertEquals(getByCode("yi"), LanguageAlpha3Code.yid);
    }


    @Test
    public void test16()
    {
        assertEquals(getByCode("ji"), LanguageAlpha3Code.yid);
    }


    @Test
    public void test17()
    {
        assertEquals(getByCode("id"), LanguageAlpha3Code.ind);
    }


    @Test
    public void test18()
    {
        assertEquals(getByCode("in"), LanguageAlpha3Code.ind);
    }


    @Test
    public void test19()
    {
        assertEquals(LanguageAlpha3Code.bod.getSynonym(), LanguageAlpha3Code.tib);
    }


    @Test
    public void test20()
    {
        assertEquals(LanguageAlpha3Code.bod.getAlpha3T(), LanguageAlpha3Code.bod);
    }


    @Test
    public void test21()
    {
        assertEquals(LanguageAlpha3Code.bod.getAlpha3B(), LanguageAlpha3Code.tib);
    }


    @Test
    public void test22()
    {
        assertEquals(LanguageAlpha3Code.bod.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test23()
    {
        assertEquals(LanguageAlpha3Code.tib.getSynonym(), LanguageAlpha3Code.bod);
    }


    @Test
    public void test24()
    {
        assertEquals(LanguageAlpha3Code.tib.getAlpha3T(), LanguageAlpha3Code.bod);
    }


    @Test
    public void test25()
    {
        assertEquals(LanguageAlpha3Code.tib.getAlpha3B(), LanguageAlpha3Code.tib);
    }


    @Test
    public void test26()
    {
        assertEquals(LanguageAlpha3Code.tib.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test27()
    {
        assertEquals(LanguageAlpha3Code.eus.getSynonym(), LanguageAlpha3Code.baq);
    }


    @Test
    public void test28()
    {
        assertEquals(LanguageAlpha3Code.eus.getAlpha3T(), LanguageAlpha3Code.eus);
    }


    @Test
    public void test29()
    {
        assertEquals(LanguageAlpha3Code.eus.getAlpha3B(), LanguageAlpha3Code.baq);
    }


    @Test
    public void test30()
    {
        assertEquals(LanguageAlpha3Code.eus.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test31()
    {
        assertEquals(LanguageAlpha3Code.baq.getSynonym(), LanguageAlpha3Code.eus);
    }


    @Test
    public void test32()
    {
        assertEquals(LanguageAlpha3Code.baq.getAlpha3T(), LanguageAlpha3Code.eus);
    }


    @Test
    public void test33()
    {
        assertEquals(LanguageAlpha3Code.baq.getAlpha3B(), LanguageAlpha3Code.baq);
    }


    @Test
    public void test34()
    {
        assertEquals(LanguageAlpha3Code.baq.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test35()
    {
        assertEquals(LanguageAlpha3Code.ces.getSynonym(), LanguageAlpha3Code.cze);
    }


    @Test
    public void test36()
    {
        assertEquals(LanguageAlpha3Code.ces.getAlpha3T(), LanguageAlpha3Code.ces);
    }


    @Test
    public void test37()
    {
        assertEquals(LanguageAlpha3Code.ces.getAlpha3B(), LanguageAlpha3Code.cze);
    }


    @Test
    public void test38()
    {
        assertEquals(LanguageAlpha3Code.ces.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test39()
    {
        assertEquals(LanguageAlpha3Code.cze.getSynonym(), LanguageAlpha3Code.ces);
    }


    @Test
    public void test40()
    {
        assertEquals(LanguageAlpha3Code.cze.getAlpha3T(), LanguageAlpha3Code.ces);
    }


    @Test
    public void test41()
    {
        assertEquals(LanguageAlpha3Code.cze.getAlpha3B(), LanguageAlpha3Code.cze);
    }


    @Test
    public void test42()
    {
        assertEquals(LanguageAlpha3Code.cze.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test43()
    {
        assertEquals(LanguageAlpha3Code.cym.getSynonym(), LanguageAlpha3Code.wel);
    }


    @Test
    public void test44()
    {
        assertEquals(LanguageAlpha3Code.cym.getAlpha3T(), LanguageAlpha3Code.cym);
    }


    @Test
    public void test45()
    {
        assertEquals(LanguageAlpha3Code.cym.getAlpha3B(), LanguageAlpha3Code.wel);
    }


    @Test
    public void test46()
    {
        assertEquals(LanguageAlpha3Code.cym.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test47()
    {
        assertEquals(LanguageAlpha3Code.wel.getSynonym(), LanguageAlpha3Code.cym);
    }


    @Test
    public void test48()
    {
        assertEquals(LanguageAlpha3Code.wel.getAlpha3T(), LanguageAlpha3Code.cym);
    }


    @Test
    public void test49()
    {
        assertEquals(LanguageAlpha3Code.wel.getAlpha3B(), LanguageAlpha3Code.wel);
    }


    @Test
    public void test50()
    {
        assertEquals(LanguageAlpha3Code.wel.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test51()
    {
        assertEquals(LanguageAlpha3Code.deu.getSynonym(), LanguageAlpha3Code.ger);
    }


    @Test
    public void test52()
    {
        assertEquals(LanguageAlpha3Code.deu.getAlpha3T(), LanguageAlpha3Code.deu);
    }


    @Test
    public void test53()
    {
        assertEquals(LanguageAlpha3Code.deu.getAlpha3B(), LanguageAlpha3Code.ger);
    }


    @Test
    public void test54()
    {
        assertEquals(LanguageAlpha3Code.deu.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test55()
    {
        assertEquals(LanguageAlpha3Code.ger.getSynonym(), LanguageAlpha3Code.deu);
    }


    @Test
    public void test56()
    {
        assertEquals(LanguageAlpha3Code.ger.getAlpha3T(), LanguageAlpha3Code.deu);
    }


    @Test
    public void test57()
    {
        assertEquals(LanguageAlpha3Code.ger.getAlpha3B(), LanguageAlpha3Code.ger);
    }


    @Test
    public void test58()
    {
        assertEquals(LanguageAlpha3Code.ger.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test59()
    {
        assertEquals(LanguageAlpha3Code.ell.getSynonym(), LanguageAlpha3Code.gre);
    }


    @Test
    public void test60()
    {
        assertEquals(LanguageAlpha3Code.ell.getAlpha3T(), LanguageAlpha3Code.ell);
    }


    @Test
    public void test61()
    {
        assertEquals(LanguageAlpha3Code.ell.getAlpha3B(), LanguageAlpha3Code.gre);
    }


    @Test
    public void test62()
    {
        assertEquals(LanguageAlpha3Code.ell.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test63()
    {
        assertEquals(LanguageAlpha3Code.gre.getSynonym(), LanguageAlpha3Code.ell);
    }


    @Test
    public void test64()
    {
        assertEquals(LanguageAlpha3Code.gre.getAlpha3T(), LanguageAlpha3Code.ell);
    }


    @Test
    public void test65()
    {
        assertEquals(LanguageAlpha3Code.gre.getAlpha3B(), LanguageAlpha3Code.gre);
    }


    @Test
    public void test66()
    {
        assertEquals(LanguageAlpha3Code.gre.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test67()
    {
        assertEquals(LanguageAlpha3Code.fas.getSynonym(), LanguageAlpha3Code.per);
    }


    @Test
    public void test68()
    {
        assertEquals(LanguageAlpha3Code.fas.getAlpha3T(), LanguageAlpha3Code.fas);
    }


    @Test
    public void test69()
    {
        assertEquals(LanguageAlpha3Code.fas.getAlpha3B(), LanguageAlpha3Code.per);
    }


    @Test
    public void test70()
    {
        assertEquals(LanguageAlpha3Code.fas.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test71()
    {
        assertEquals(LanguageAlpha3Code.per.getSynonym(), LanguageAlpha3Code.fas);
    }


    @Test
    public void test72()
    {
        assertEquals(LanguageAlpha3Code.per.getAlpha3T(), LanguageAlpha3Code.fas);
    }


    @Test
    public void test73()
    {
        assertEquals(LanguageAlpha3Code.per.getAlpha3B(), LanguageAlpha3Code.per);
    }


    @Test
    public void test74()
    {
        assertEquals(LanguageAlpha3Code.per.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test75()
    {
        assertEquals(LanguageAlpha3Code.fra.getSynonym(), LanguageAlpha3Code.fre);
    }


    @Test
    public void test76()
    {
        assertEquals(LanguageAlpha3Code.fra.getAlpha3T(), LanguageAlpha3Code.fra);
    }


    @Test
    public void test77()
    {
        assertEquals(LanguageAlpha3Code.fra.getAlpha3B(), LanguageAlpha3Code.fre);
    }


    @Test
    public void test78()
    {
        assertEquals(LanguageAlpha3Code.fra.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test79()
    {
        assertEquals(LanguageAlpha3Code.fre.getSynonym(), LanguageAlpha3Code.fra);
    }


    @Test
    public void test80()
    {
        assertEquals(LanguageAlpha3Code.fre.getAlpha3T(), LanguageAlpha3Code.fra);
    }


    @Test
    public void test81()
    {
        assertEquals(LanguageAlpha3Code.fre.getAlpha3B(), LanguageAlpha3Code.fre);
    }


    @Test
    public void test82()
    {
        assertEquals(LanguageAlpha3Code.fre.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test83()
    {
        assertEquals(LanguageAlpha3Code.hye.getSynonym(), LanguageAlpha3Code.arm);
    }


    @Test
    public void test84()
    {
        assertEquals(LanguageAlpha3Code.hye.getAlpha3T(), LanguageAlpha3Code.hye);
    }


    @Test
    public void test85()
    {
        assertEquals(LanguageAlpha3Code.hye.getAlpha3B(), LanguageAlpha3Code.arm);
    }


    @Test
    public void test86()
    {
        assertEquals(LanguageAlpha3Code.hye.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test87()
    {
        assertEquals(LanguageAlpha3Code.arm.getSynonym(), LanguageAlpha3Code.hye);
    }


    @Test
    public void test88()
    {
        assertEquals(LanguageAlpha3Code.arm.getAlpha3T(), LanguageAlpha3Code.hye);
    }


    @Test
    public void test89()
    {
        assertEquals(LanguageAlpha3Code.arm.getAlpha3B(), LanguageAlpha3Code.arm);
    }


    @Test
    public void test90()
    {
        assertEquals(LanguageAlpha3Code.arm.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test91()
    {
        assertEquals(LanguageAlpha3Code.isl.getSynonym(), LanguageAlpha3Code.ice);
    }


    @Test
    public void test92()
    {
        assertEquals(LanguageAlpha3Code.isl.getAlpha3T(), LanguageAlpha3Code.isl);
    }


    @Test
    public void test93()
    {
        assertEquals(LanguageAlpha3Code.isl.getAlpha3B(), LanguageAlpha3Code.ice);
    }


    @Test
    public void test94()
    {
        assertEquals(LanguageAlpha3Code.isl.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test95()
    {
        assertEquals(LanguageAlpha3Code.ice.getSynonym(), LanguageAlpha3Code.isl);
    }


    @Test
    public void test96()
    {
        assertEquals(LanguageAlpha3Code.ice.getAlpha3T(), LanguageAlpha3Code.isl);
    }


    @Test
    public void test97()
    {
        assertEquals(LanguageAlpha3Code.ice.getAlpha3B(), LanguageAlpha3Code.ice);
    }


    @Test
    public void test98()
    {
        assertEquals(LanguageAlpha3Code.ice.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test99()
    {
        assertEquals(LanguageAlpha3Code.kat.getSynonym(), LanguageAlpha3Code.geo);
    }


    @Test
    public void test100()
    {
        assertEquals(LanguageAlpha3Code.kat.getAlpha3T(), LanguageAlpha3Code.kat);
    }


    @Test
    public void test101()
    {
        assertEquals(LanguageAlpha3Code.kat.getAlpha3B(), LanguageAlpha3Code.geo);
    }


    @Test
    public void test102()
    {
        assertEquals(LanguageAlpha3Code.kat.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test103()
    {
        assertEquals(LanguageAlpha3Code.geo.getSynonym(), LanguageAlpha3Code.kat);
    }


    @Test
    public void test104()
    {
        assertEquals(LanguageAlpha3Code.geo.getAlpha3T(), LanguageAlpha3Code.kat);
    }


    @Test
    public void test105()
    {
        assertEquals(LanguageAlpha3Code.geo.getAlpha3B(), LanguageAlpha3Code.geo);
    }


    @Test
    public void test106()
    {
        assertEquals(LanguageAlpha3Code.geo.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test107()
    {
        assertEquals(LanguageAlpha3Code.mri.getSynonym(), LanguageAlpha3Code.mao);
    }


    @Test
    public void test108()
    {
        assertEquals(LanguageAlpha3Code.mri.getAlpha3T(), LanguageAlpha3Code.mri);
    }


    @Test
    public void test109()
    {
        assertEquals(LanguageAlpha3Code.mri.getAlpha3B(), LanguageAlpha3Code.mao);
    }


    @Test
    public void test110()
    {
        assertEquals(LanguageAlpha3Code.mri.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test111()
    {
        assertEquals(LanguageAlpha3Code.mao.getSynonym(), LanguageAlpha3Code.mri);
    }


    @Test
    public void test112()
    {
        assertEquals(LanguageAlpha3Code.mao.getAlpha3T(), LanguageAlpha3Code.mri);
    }


    @Test
    public void test113()
    {
        assertEquals(LanguageAlpha3Code.mao.getAlpha3B(), LanguageAlpha3Code.mao);
    }


    @Test
    public void test114()
    {
        assertEquals(LanguageAlpha3Code.mao.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test115()
    {
        assertEquals(LanguageAlpha3Code.mkd.getSynonym(), LanguageAlpha3Code.mac);
    }


    @Test
    public void test116()
    {
        assertEquals(LanguageAlpha3Code.mkd.getAlpha3T(), LanguageAlpha3Code.mkd);
    }


    @Test
    public void test117()
    {
        assertEquals(LanguageAlpha3Code.mkd.getAlpha3B(), LanguageAlpha3Code.mac);
    }


    @Test
    public void test118()
    {
        assertEquals(LanguageAlpha3Code.mkd.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test119()
    {
        assertEquals(LanguageAlpha3Code.mac.getSynonym(), LanguageAlpha3Code.mkd);
    }


    @Test
    public void test120()
    {
        assertEquals(LanguageAlpha3Code.mac.getAlpha3T(), LanguageAlpha3Code.mkd);
    }


    @Test
    public void test121()
    {
        assertEquals(LanguageAlpha3Code.mac.getAlpha3B(), LanguageAlpha3Code.mac);
    }


    @Test
    public void test122()
    {
        assertEquals(LanguageAlpha3Code.mac.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test123()
    {
        assertEquals(LanguageAlpha3Code.msa.getSynonym(), LanguageAlpha3Code.may);
    }


    @Test
    public void test124()
    {
        assertEquals(LanguageAlpha3Code.msa.getAlpha3T(), LanguageAlpha3Code.msa);
    }


    @Test
    public void test125()
    {
        assertEquals(LanguageAlpha3Code.msa.getAlpha3B(), LanguageAlpha3Code.may);
    }


    @Test
    public void test126()
    {
        assertEquals(LanguageAlpha3Code.msa.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test127()
    {
        assertEquals(LanguageAlpha3Code.may.getSynonym(), LanguageAlpha3Code.msa);
    }


    @Test
    public void test128()
    {
        assertEquals(LanguageAlpha3Code.may.getAlpha3T(), LanguageAlpha3Code.msa);
    }


    @Test
    public void test129()
    {
        assertEquals(LanguageAlpha3Code.may.getAlpha3B(), LanguageAlpha3Code.may);
    }


    @Test
    public void test130()
    {
        assertEquals(LanguageAlpha3Code.may.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test131()
    {
        assertEquals(LanguageAlpha3Code.mya.getSynonym(), LanguageAlpha3Code.bur);
    }


    @Test
    public void test132()
    {
        assertEquals(LanguageAlpha3Code.mya.getAlpha3T(), LanguageAlpha3Code.mya);
    }


    @Test
    public void test133()
    {
        assertEquals(LanguageAlpha3Code.mya.getAlpha3B(), LanguageAlpha3Code.bur);
    }


    @Test
    public void test134()
    {
        assertEquals(LanguageAlpha3Code.mya.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test135()
    {
        assertEquals(LanguageAlpha3Code.bur.getSynonym(), LanguageAlpha3Code.mya);
    }


    @Test
    public void test136()
    {
        assertEquals(LanguageAlpha3Code.bur.getAlpha3T(), LanguageAlpha3Code.mya);
    }


    @Test
    public void test137()
    {
        assertEquals(LanguageAlpha3Code.bur.getAlpha3B(), LanguageAlpha3Code.bur);
    }


    @Test
    public void test138()
    {
        assertEquals(LanguageAlpha3Code.bur.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test139()
    {
        assertEquals(LanguageAlpha3Code.nld.getSynonym(), LanguageAlpha3Code.dut);
    }


    @Test
    public void test140()
    {
        assertEquals(LanguageAlpha3Code.nld.getAlpha3T(), LanguageAlpha3Code.nld);
    }


    @Test
    public void test141()
    {
        assertEquals(LanguageAlpha3Code.nld.getAlpha3B(), LanguageAlpha3Code.dut);
    }


    @Test
    public void test142()
    {
        assertEquals(LanguageAlpha3Code.nld.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test143()
    {
        assertEquals(LanguageAlpha3Code.dut.getSynonym(), LanguageAlpha3Code.nld);
    }


    @Test
    public void test144()
    {
        assertEquals(LanguageAlpha3Code.dut.getAlpha3T(), LanguageAlpha3Code.nld);
    }


    @Test
    public void test145()
    {
        assertEquals(LanguageAlpha3Code.dut.getAlpha3B(), LanguageAlpha3Code.dut);
    }


    @Test
    public void test146()
    {
        assertEquals(LanguageAlpha3Code.dut.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test147()
    {
        assertEquals(LanguageAlpha3Code.ron.getSynonym(), LanguageAlpha3Code.rum);
    }


    @Test
    public void test148()
    {
        assertEquals(LanguageAlpha3Code.ron.getAlpha3T(), LanguageAlpha3Code.ron);
    }


    @Test
    public void test149()
    {
        assertEquals(LanguageAlpha3Code.ron.getAlpha3B(), LanguageAlpha3Code.rum);
    }


    @Test
    public void test150()
    {
        assertEquals(LanguageAlpha3Code.ron.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test151()
    {
        assertEquals(LanguageAlpha3Code.rum.getSynonym(), LanguageAlpha3Code.ron);
    }


    @Test
    public void test152()
    {
        assertEquals(LanguageAlpha3Code.rum.getAlpha3T(), LanguageAlpha3Code.ron);
    }


    @Test
    public void test153()
    {
        assertEquals(LanguageAlpha3Code.rum.getAlpha3B(), LanguageAlpha3Code.rum);
    }


    @Test
    public void test154()
    {
        assertEquals(LanguageAlpha3Code.rum.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test155()
    {
        assertEquals(LanguageAlpha3Code.slk.getSynonym(), LanguageAlpha3Code.slo);
    }


    @Test
    public void test156()
    {
        assertEquals(LanguageAlpha3Code.slk.getAlpha3T(), LanguageAlpha3Code.slk);
    }


    @Test
    public void test157()
    {
        assertEquals(LanguageAlpha3Code.slk.getAlpha3B(), LanguageAlpha3Code.slo);
    }


    @Test
    public void test158()
    {
        assertEquals(LanguageAlpha3Code.slk.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test159()
    {
        assertEquals(LanguageAlpha3Code.slo.getSynonym(), LanguageAlpha3Code.slk);
    }


    @Test
    public void test160()
    {
        assertEquals(LanguageAlpha3Code.slo.getAlpha3T(), LanguageAlpha3Code.slk);
    }


    @Test
    public void test161()
    {
        assertEquals(LanguageAlpha3Code.slo.getAlpha3B(), LanguageAlpha3Code.slo);
    }


    @Test
    public void test162()
    {
        assertEquals(LanguageAlpha3Code.slo.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test163()
    {
        assertEquals(LanguageAlpha3Code.sqi.getSynonym(), LanguageAlpha3Code.alb);
    }


    @Test
    public void test164()
    {
        assertEquals(LanguageAlpha3Code.sqi.getAlpha3T(), LanguageAlpha3Code.sqi);
    }


    @Test
    public void test165()
    {
        assertEquals(LanguageAlpha3Code.sqi.getAlpha3B(), LanguageAlpha3Code.alb);
    }


    @Test
    public void test166()
    {
        assertEquals(LanguageAlpha3Code.sqi.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test167()
    {
        assertEquals(LanguageAlpha3Code.alb.getSynonym(), LanguageAlpha3Code.sqi);
    }


    @Test
    public void test168()
    {
        assertEquals(LanguageAlpha3Code.alb.getAlpha3T(), LanguageAlpha3Code.sqi);
    }


    @Test
    public void test169()
    {
        assertEquals(LanguageAlpha3Code.alb.getAlpha3B(), LanguageAlpha3Code.alb);
    }


    @Test
    public void test170()
    {
        assertEquals(LanguageAlpha3Code.alb.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test171()
    {
        assertEquals(LanguageAlpha3Code.jpn.getSynonym(), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test172()
    {
        assertEquals(LanguageAlpha3Code.jpn.getAlpha3T(), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test173()
    {
        assertEquals(LanguageAlpha3Code.jpn.getAlpha3B(), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test174()
    {
        assertEquals(LanguageAlpha3Code.jpn.getUsage(), COMMON);
    }


    @Test
    public void test175()
    {
        assertEquals(LanguageAlpha3Code.jpn.getName(), "Japanese");
    }
}
