/*
 * Copyright (C) 2012-2013 Neo Visionaries Inc.
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
        assertSame(getByCode("jpn"), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test8()
    {
        assertSame(getByCode("JPN"), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test9()
    {
        assertSame(getByCode("jpn", true), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test10()
    {
        assertNull(getByCode("JPN", true));
    }


    @Test
    public void test11()
    {
        assertSame(getByCode("jpn", false), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test12()
    {
        assertSame(getByCode("JPN", false), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test13()
    {
        assertSame(getByCode("he"), LanguageAlpha3Code.heb);
    }


    @Test
    public void test14()
    {
        assertSame(getByCode("iw"), LanguageAlpha3Code.heb);
    }


    @Test
    public void test15()
    {
        assertSame(getByCode("yi"), LanguageAlpha3Code.yid);
    }


    @Test
    public void test16()
    {
        assertSame(getByCode("ji"), LanguageAlpha3Code.yid);
    }


    @Test
    public void test17()
    {
        assertSame(getByCode("id"), LanguageAlpha3Code.ind);
    }


    @Test
    public void test18()
    {
        assertSame(getByCode("in"), LanguageAlpha3Code.ind);
    }


    @Test
    public void test19()
    {
        assertSame(LanguageAlpha3Code.bod.getSynonym(), LanguageAlpha3Code.tib);
    }


    @Test
    public void test20()
    {
        assertSame(LanguageAlpha3Code.bod.getAlpha3T(), LanguageAlpha3Code.bod);
    }


    @Test
    public void test21()
    {
        assertSame(LanguageAlpha3Code.bod.getAlpha3B(), LanguageAlpha3Code.tib);
    }


    @Test
    public void test22()
    {
        assertSame(LanguageAlpha3Code.bod.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test23()
    {
        assertSame(LanguageAlpha3Code.tib.getSynonym(), LanguageAlpha3Code.bod);
    }


    @Test
    public void test24()
    {
        assertSame(LanguageAlpha3Code.tib.getAlpha3T(), LanguageAlpha3Code.bod);
    }


    @Test
    public void test25()
    {
        assertSame(LanguageAlpha3Code.tib.getAlpha3B(), LanguageAlpha3Code.tib);
    }


    @Test
    public void test26()
    {
        assertSame(LanguageAlpha3Code.tib.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test27()
    {
        assertSame(LanguageAlpha3Code.eus.getSynonym(), LanguageAlpha3Code.baq);
    }


    @Test
    public void test28()
    {
        assertSame(LanguageAlpha3Code.eus.getAlpha3T(), LanguageAlpha3Code.eus);
    }


    @Test
    public void test29()
    {
        assertSame(LanguageAlpha3Code.eus.getAlpha3B(), LanguageAlpha3Code.baq);
    }


    @Test
    public void test30()
    {
        assertSame(LanguageAlpha3Code.eus.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test31()
    {
        assertSame(LanguageAlpha3Code.baq.getSynonym(), LanguageAlpha3Code.eus);
    }


    @Test
    public void test32()
    {
        assertSame(LanguageAlpha3Code.baq.getAlpha3T(), LanguageAlpha3Code.eus);
    }


    @Test
    public void test33()
    {
        assertSame(LanguageAlpha3Code.baq.getAlpha3B(), LanguageAlpha3Code.baq);
    }


    @Test
    public void test34()
    {
        assertSame(LanguageAlpha3Code.baq.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test35()
    {
        assertSame(LanguageAlpha3Code.ces.getSynonym(), LanguageAlpha3Code.cze);
    }


    @Test
    public void test36()
    {
        assertSame(LanguageAlpha3Code.ces.getAlpha3T(), LanguageAlpha3Code.ces);
    }


    @Test
    public void test37()
    {
        assertSame(LanguageAlpha3Code.ces.getAlpha3B(), LanguageAlpha3Code.cze);
    }


    @Test
    public void test38()
    {
        assertSame(LanguageAlpha3Code.ces.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test39()
    {
        assertSame(LanguageAlpha3Code.cze.getSynonym(), LanguageAlpha3Code.ces);
    }


    @Test
    public void test40()
    {
        assertSame(LanguageAlpha3Code.cze.getAlpha3T(), LanguageAlpha3Code.ces);
    }


    @Test
    public void test41()
    {
        assertSame(LanguageAlpha3Code.cze.getAlpha3B(), LanguageAlpha3Code.cze);
    }


    @Test
    public void test42()
    {
        assertSame(LanguageAlpha3Code.cze.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test43()
    {
        assertSame(LanguageAlpha3Code.cym.getSynonym(), LanguageAlpha3Code.wel);
    }


    @Test
    public void test44()
    {
        assertSame(LanguageAlpha3Code.cym.getAlpha3T(), LanguageAlpha3Code.cym);
    }


    @Test
    public void test45()
    {
        assertSame(LanguageAlpha3Code.cym.getAlpha3B(), LanguageAlpha3Code.wel);
    }


    @Test
    public void test46()
    {
        assertSame(LanguageAlpha3Code.cym.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test47()
    {
        assertSame(LanguageAlpha3Code.wel.getSynonym(), LanguageAlpha3Code.cym);
    }


    @Test
    public void test48()
    {
        assertSame(LanguageAlpha3Code.wel.getAlpha3T(), LanguageAlpha3Code.cym);
    }


    @Test
    public void test49()
    {
        assertSame(LanguageAlpha3Code.wel.getAlpha3B(), LanguageAlpha3Code.wel);
    }


    @Test
    public void test50()
    {
        assertSame(LanguageAlpha3Code.wel.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test51()
    {
        assertSame(LanguageAlpha3Code.deu.getSynonym(), LanguageAlpha3Code.ger);
    }


    @Test
    public void test52()
    {
        assertSame(LanguageAlpha3Code.deu.getAlpha3T(), LanguageAlpha3Code.deu);
    }


    @Test
    public void test53()
    {
        assertSame(LanguageAlpha3Code.deu.getAlpha3B(), LanguageAlpha3Code.ger);
    }


    @Test
    public void test54()
    {
        assertSame(LanguageAlpha3Code.deu.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test55()
    {
        assertSame(LanguageAlpha3Code.ger.getSynonym(), LanguageAlpha3Code.deu);
    }


    @Test
    public void test56()
    {
        assertSame(LanguageAlpha3Code.ger.getAlpha3T(), LanguageAlpha3Code.deu);
    }


    @Test
    public void test57()
    {
        assertSame(LanguageAlpha3Code.ger.getAlpha3B(), LanguageAlpha3Code.ger);
    }


    @Test
    public void test58()
    {
        assertSame(LanguageAlpha3Code.ger.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test59()
    {
        assertSame(LanguageAlpha3Code.ell.getSynonym(), LanguageAlpha3Code.gre);
    }


    @Test
    public void test60()
    {
        assertSame(LanguageAlpha3Code.ell.getAlpha3T(), LanguageAlpha3Code.ell);
    }


    @Test
    public void test61()
    {
        assertSame(LanguageAlpha3Code.ell.getAlpha3B(), LanguageAlpha3Code.gre);
    }


    @Test
    public void test62()
    {
        assertSame(LanguageAlpha3Code.ell.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test63()
    {
        assertSame(LanguageAlpha3Code.gre.getSynonym(), LanguageAlpha3Code.ell);
    }


    @Test
    public void test64()
    {
        assertSame(LanguageAlpha3Code.gre.getAlpha3T(), LanguageAlpha3Code.ell);
    }


    @Test
    public void test65()
    {
        assertSame(LanguageAlpha3Code.gre.getAlpha3B(), LanguageAlpha3Code.gre);
    }


    @Test
    public void test66()
    {
        assertSame(LanguageAlpha3Code.gre.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test67()
    {
        assertSame(LanguageAlpha3Code.fas.getSynonym(), LanguageAlpha3Code.per);
    }


    @Test
    public void test68()
    {
        assertSame(LanguageAlpha3Code.fas.getAlpha3T(), LanguageAlpha3Code.fas);
    }


    @Test
    public void test69()
    {
        assertSame(LanguageAlpha3Code.fas.getAlpha3B(), LanguageAlpha3Code.per);
    }


    @Test
    public void test70()
    {
        assertSame(LanguageAlpha3Code.fas.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test71()
    {
        assertSame(LanguageAlpha3Code.per.getSynonym(), LanguageAlpha3Code.fas);
    }


    @Test
    public void test72()
    {
        assertSame(LanguageAlpha3Code.per.getAlpha3T(), LanguageAlpha3Code.fas);
    }


    @Test
    public void test73()
    {
        assertSame(LanguageAlpha3Code.per.getAlpha3B(), LanguageAlpha3Code.per);
    }


    @Test
    public void test74()
    {
        assertSame(LanguageAlpha3Code.per.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test75()
    {
        assertSame(LanguageAlpha3Code.fra.getSynonym(), LanguageAlpha3Code.fre);
    }


    @Test
    public void test76()
    {
        assertSame(LanguageAlpha3Code.fra.getAlpha3T(), LanguageAlpha3Code.fra);
    }


    @Test
    public void test77()
    {
        assertSame(LanguageAlpha3Code.fra.getAlpha3B(), LanguageAlpha3Code.fre);
    }


    @Test
    public void test78()
    {
        assertSame(LanguageAlpha3Code.fra.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test79()
    {
        assertSame(LanguageAlpha3Code.fre.getSynonym(), LanguageAlpha3Code.fra);
    }


    @Test
    public void test80()
    {
        assertSame(LanguageAlpha3Code.fre.getAlpha3T(), LanguageAlpha3Code.fra);
    }


    @Test
    public void test81()
    {
        assertSame(LanguageAlpha3Code.fre.getAlpha3B(), LanguageAlpha3Code.fre);
    }


    @Test
    public void test82()
    {
        assertSame(LanguageAlpha3Code.fre.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test83()
    {
        assertSame(LanguageAlpha3Code.hye.getSynonym(), LanguageAlpha3Code.arm);
    }


    @Test
    public void test84()
    {
        assertSame(LanguageAlpha3Code.hye.getAlpha3T(), LanguageAlpha3Code.hye);
    }


    @Test
    public void test85()
    {
        assertSame(LanguageAlpha3Code.hye.getAlpha3B(), LanguageAlpha3Code.arm);
    }


    @Test
    public void test86()
    {
        assertSame(LanguageAlpha3Code.hye.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test87()
    {
        assertSame(LanguageAlpha3Code.arm.getSynonym(), LanguageAlpha3Code.hye);
    }


    @Test
    public void test88()
    {
        assertSame(LanguageAlpha3Code.arm.getAlpha3T(), LanguageAlpha3Code.hye);
    }


    @Test
    public void test89()
    {
        assertSame(LanguageAlpha3Code.arm.getAlpha3B(), LanguageAlpha3Code.arm);
    }


    @Test
    public void test90()
    {
        assertSame(LanguageAlpha3Code.arm.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test91()
    {
        assertSame(LanguageAlpha3Code.isl.getSynonym(), LanguageAlpha3Code.ice);
    }


    @Test
    public void test92()
    {
        assertSame(LanguageAlpha3Code.isl.getAlpha3T(), LanguageAlpha3Code.isl);
    }


    @Test
    public void test93()
    {
        assertSame(LanguageAlpha3Code.isl.getAlpha3B(), LanguageAlpha3Code.ice);
    }


    @Test
    public void test94()
    {
        assertSame(LanguageAlpha3Code.isl.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test95()
    {
        assertSame(LanguageAlpha3Code.ice.getSynonym(), LanguageAlpha3Code.isl);
    }


    @Test
    public void test96()
    {
        assertSame(LanguageAlpha3Code.ice.getAlpha3T(), LanguageAlpha3Code.isl);
    }


    @Test
    public void test97()
    {
        assertSame(LanguageAlpha3Code.ice.getAlpha3B(), LanguageAlpha3Code.ice);
    }


    @Test
    public void test98()
    {
        assertSame(LanguageAlpha3Code.ice.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test99()
    {
        assertSame(LanguageAlpha3Code.kat.getSynonym(), LanguageAlpha3Code.geo);
    }


    @Test
    public void test100()
    {
        assertSame(LanguageAlpha3Code.kat.getAlpha3T(), LanguageAlpha3Code.kat);
    }


    @Test
    public void test101()
    {
        assertSame(LanguageAlpha3Code.kat.getAlpha3B(), LanguageAlpha3Code.geo);
    }


    @Test
    public void test102()
    {
        assertSame(LanguageAlpha3Code.kat.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test103()
    {
        assertSame(LanguageAlpha3Code.geo.getSynonym(), LanguageAlpha3Code.kat);
    }


    @Test
    public void test104()
    {
        assertSame(LanguageAlpha3Code.geo.getAlpha3T(), LanguageAlpha3Code.kat);
    }


    @Test
    public void test105()
    {
        assertSame(LanguageAlpha3Code.geo.getAlpha3B(), LanguageAlpha3Code.geo);
    }


    @Test
    public void test106()
    {
        assertSame(LanguageAlpha3Code.geo.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test107()
    {
        assertSame(LanguageAlpha3Code.mri.getSynonym(), LanguageAlpha3Code.mao);
    }


    @Test
    public void test108()
    {
        assertSame(LanguageAlpha3Code.mri.getAlpha3T(), LanguageAlpha3Code.mri);
    }


    @Test
    public void test109()
    {
        assertSame(LanguageAlpha3Code.mri.getAlpha3B(), LanguageAlpha3Code.mao);
    }


    @Test
    public void test110()
    {
        assertSame(LanguageAlpha3Code.mri.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test111()
    {
        assertSame(LanguageAlpha3Code.mao.getSynonym(), LanguageAlpha3Code.mri);
    }


    @Test
    public void test112()
    {
        assertSame(LanguageAlpha3Code.mao.getAlpha3T(), LanguageAlpha3Code.mri);
    }


    @Test
    public void test113()
    {
        assertSame(LanguageAlpha3Code.mao.getAlpha3B(), LanguageAlpha3Code.mao);
    }


    @Test
    public void test114()
    {
        assertSame(LanguageAlpha3Code.mao.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test115()
    {
        assertSame(LanguageAlpha3Code.mkd.getSynonym(), LanguageAlpha3Code.mac);
    }


    @Test
    public void test116()
    {
        assertSame(LanguageAlpha3Code.mkd.getAlpha3T(), LanguageAlpha3Code.mkd);
    }


    @Test
    public void test117()
    {
        assertSame(LanguageAlpha3Code.mkd.getAlpha3B(), LanguageAlpha3Code.mac);
    }


    @Test
    public void test118()
    {
        assertSame(LanguageAlpha3Code.mkd.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test119()
    {
        assertSame(LanguageAlpha3Code.mac.getSynonym(), LanguageAlpha3Code.mkd);
    }


    @Test
    public void test120()
    {
        assertSame(LanguageAlpha3Code.mac.getAlpha3T(), LanguageAlpha3Code.mkd);
    }


    @Test
    public void test121()
    {
        assertSame(LanguageAlpha3Code.mac.getAlpha3B(), LanguageAlpha3Code.mac);
    }


    @Test
    public void test122()
    {
        assertSame(LanguageAlpha3Code.mac.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test123()
    {
        assertSame(LanguageAlpha3Code.msa.getSynonym(), LanguageAlpha3Code.may);
    }


    @Test
    public void test124()
    {
        assertSame(LanguageAlpha3Code.msa.getAlpha3T(), LanguageAlpha3Code.msa);
    }


    @Test
    public void test125()
    {
        assertSame(LanguageAlpha3Code.msa.getAlpha3B(), LanguageAlpha3Code.may);
    }


    @Test
    public void test126()
    {
        assertSame(LanguageAlpha3Code.msa.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test127()
    {
        assertSame(LanguageAlpha3Code.may.getSynonym(), LanguageAlpha3Code.msa);
    }


    @Test
    public void test128()
    {
        assertSame(LanguageAlpha3Code.may.getAlpha3T(), LanguageAlpha3Code.msa);
    }


    @Test
    public void test129()
    {
        assertSame(LanguageAlpha3Code.may.getAlpha3B(), LanguageAlpha3Code.may);
    }


    @Test
    public void test130()
    {
        assertSame(LanguageAlpha3Code.may.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test131()
    {
        assertSame(LanguageAlpha3Code.mya.getSynonym(), LanguageAlpha3Code.bur);
    }


    @Test
    public void test132()
    {
        assertSame(LanguageAlpha3Code.mya.getAlpha3T(), LanguageAlpha3Code.mya);
    }


    @Test
    public void test133()
    {
        assertSame(LanguageAlpha3Code.mya.getAlpha3B(), LanguageAlpha3Code.bur);
    }


    @Test
    public void test134()
    {
        assertSame(LanguageAlpha3Code.mya.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test135()
    {
        assertSame(LanguageAlpha3Code.bur.getSynonym(), LanguageAlpha3Code.mya);
    }


    @Test
    public void test136()
    {
        assertSame(LanguageAlpha3Code.bur.getAlpha3T(), LanguageAlpha3Code.mya);
    }


    @Test
    public void test137()
    {
        assertSame(LanguageAlpha3Code.bur.getAlpha3B(), LanguageAlpha3Code.bur);
    }


    @Test
    public void test138()
    {
        assertSame(LanguageAlpha3Code.bur.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test139()
    {
        assertSame(LanguageAlpha3Code.nld.getSynonym(), LanguageAlpha3Code.dut);
    }


    @Test
    public void test140()
    {
        assertSame(LanguageAlpha3Code.nld.getAlpha3T(), LanguageAlpha3Code.nld);
    }


    @Test
    public void test141()
    {
        assertSame(LanguageAlpha3Code.nld.getAlpha3B(), LanguageAlpha3Code.dut);
    }


    @Test
    public void test142()
    {
        assertSame(LanguageAlpha3Code.nld.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test143()
    {
        assertSame(LanguageAlpha3Code.dut.getSynonym(), LanguageAlpha3Code.nld);
    }


    @Test
    public void test144()
    {
        assertSame(LanguageAlpha3Code.dut.getAlpha3T(), LanguageAlpha3Code.nld);
    }


    @Test
    public void test145()
    {
        assertSame(LanguageAlpha3Code.dut.getAlpha3B(), LanguageAlpha3Code.dut);
    }


    @Test
    public void test146()
    {
        assertSame(LanguageAlpha3Code.dut.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test147()
    {
        assertSame(LanguageAlpha3Code.ron.getSynonym(), LanguageAlpha3Code.rum);
    }


    @Test
    public void test148()
    {
        assertSame(LanguageAlpha3Code.ron.getAlpha3T(), LanguageAlpha3Code.ron);
    }


    @Test
    public void test149()
    {
        assertSame(LanguageAlpha3Code.ron.getAlpha3B(), LanguageAlpha3Code.rum);
    }


    @Test
    public void test150()
    {
        assertSame(LanguageAlpha3Code.ron.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test151()
    {
        assertSame(LanguageAlpha3Code.rum.getSynonym(), LanguageAlpha3Code.ron);
    }


    @Test
    public void test152()
    {
        assertSame(LanguageAlpha3Code.rum.getAlpha3T(), LanguageAlpha3Code.ron);
    }


    @Test
    public void test153()
    {
        assertSame(LanguageAlpha3Code.rum.getAlpha3B(), LanguageAlpha3Code.rum);
    }


    @Test
    public void test154()
    {
        assertSame(LanguageAlpha3Code.rum.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test155()
    {
        assertSame(LanguageAlpha3Code.slk.getSynonym(), LanguageAlpha3Code.slo);
    }


    @Test
    public void test156()
    {
        assertSame(LanguageAlpha3Code.slk.getAlpha3T(), LanguageAlpha3Code.slk);
    }


    @Test
    public void test157()
    {
        assertSame(LanguageAlpha3Code.slk.getAlpha3B(), LanguageAlpha3Code.slo);
    }


    @Test
    public void test158()
    {
        assertSame(LanguageAlpha3Code.slk.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test159()
    {
        assertSame(LanguageAlpha3Code.slo.getSynonym(), LanguageAlpha3Code.slk);
    }


    @Test
    public void test160()
    {
        assertSame(LanguageAlpha3Code.slo.getAlpha3T(), LanguageAlpha3Code.slk);
    }


    @Test
    public void test161()
    {
        assertSame(LanguageAlpha3Code.slo.getAlpha3B(), LanguageAlpha3Code.slo);
    }


    @Test
    public void test162()
    {
        assertSame(LanguageAlpha3Code.slo.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test163()
    {
        assertSame(LanguageAlpha3Code.sqi.getSynonym(), LanguageAlpha3Code.alb);
    }


    @Test
    public void test164()
    {
        assertSame(LanguageAlpha3Code.sqi.getAlpha3T(), LanguageAlpha3Code.sqi);
    }


    @Test
    public void test165()
    {
        assertSame(LanguageAlpha3Code.sqi.getAlpha3B(), LanguageAlpha3Code.alb);
    }


    @Test
    public void test166()
    {
        assertSame(LanguageAlpha3Code.sqi.getUsage(), TERMINOLOGY);
    }


    @Test
    public void test167()
    {
        assertSame(LanguageAlpha3Code.alb.getSynonym(), LanguageAlpha3Code.sqi);
    }


    @Test
    public void test168()
    {
        assertSame(LanguageAlpha3Code.alb.getAlpha3T(), LanguageAlpha3Code.sqi);
    }


    @Test
    public void test169()
    {
        assertSame(LanguageAlpha3Code.alb.getAlpha3B(), LanguageAlpha3Code.alb);
    }


    @Test
    public void test170()
    {
        assertSame(LanguageAlpha3Code.alb.getUsage(), BIBLIOGRAPHY);
    }


    @Test
    public void test171()
    {
        assertSame(LanguageAlpha3Code.jpn.getSynonym(), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test172()
    {
        assertSame(LanguageAlpha3Code.jpn.getAlpha3T(), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test173()
    {
        assertSame(LanguageAlpha3Code.jpn.getAlpha3B(), LanguageAlpha3Code.jpn);
    }


    @Test
    public void test174()
    {
        assertSame(LanguageAlpha3Code.jpn.getUsage(), COMMON);
    }


    @Test
    public void test175()
    {
        assertSame(LanguageAlpha3Code.jpn.getName(), "Japanese");
    }
}
