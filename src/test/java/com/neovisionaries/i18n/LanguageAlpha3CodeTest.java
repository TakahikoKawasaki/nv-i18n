/*
 * Copyright (C) 2012-2014 Neo Visionaries Inc.
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


import static com.neovisionaries.i18n.LanguageAlpha3Code.getByCode;
import static com.neovisionaries.i18n.LanguageAlpha3Code.Usage.BIBLIOGRAPHY;
import static com.neovisionaries.i18n.LanguageAlpha3Code.Usage.COMMON;
import static com.neovisionaries.i18n.LanguageAlpha3Code.Usage.TERMINOLOGY;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Test;


public class LanguageAlpha3CodeTest
{
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
        assertSame(LanguageAlpha3Code.jpn, getByCode("jpn"));
    }


    @Test
    public void test8()
    {
        assertNull(getByCode("JPN"));
    }


    @Test
    public void test9()
    {
        assertSame(LanguageAlpha3Code.jpn, getByCode("jpn", true));
    }


    @Test
    public void test10()
    {
        assertNull(getByCode("JPN", true));
    }


    @Test
    public void test11()
    {
        assertSame(LanguageAlpha3Code.jpn, getByCode("jpn", false));
    }


    @Test
    public void test12()
    {
        assertSame(LanguageAlpha3Code.jpn, getByCode("JPN", false));
    }


    @Test
    public void test13()
    {
        assertSame(LanguageAlpha3Code.heb, getByCode("he"));
    }


    @Test
    public void test14()
    {
        assertSame(LanguageAlpha3Code.heb, getByCode("iw"));
    }


    @Test
    public void test15()
    {
        assertSame(LanguageAlpha3Code.yid, getByCode("yi"));
    }


    @Test
    public void test16()
    {
        assertSame(LanguageAlpha3Code.yid, getByCode("ji"));
    }


    @Test
    public void test17()
    {
        assertSame(LanguageAlpha3Code.ind, getByCode("id"));
    }


    @Test
    public void test18()
    {
        assertSame(LanguageAlpha3Code.ind, getByCode("in"));
    }


    @Test
    public void test19()
    {
        assertSame(LanguageAlpha3Code.tib, LanguageAlpha3Code.bod.getSynonym());
    }


    @Test
    public void test20()
    {
        assertSame(LanguageAlpha3Code.bod, LanguageAlpha3Code.bod.getAlpha3T());
    }


    @Test
    public void test21()
    {
        assertSame(LanguageAlpha3Code.tib, LanguageAlpha3Code.bod.getAlpha3B());
    }


    @Test
    public void test22()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.bod.getUsage());
    }


    @Test
    public void test23()
    {
        assertSame(LanguageAlpha3Code.bod, LanguageAlpha3Code.tib.getSynonym());
    }


    @Test
    public void test24()
    {
        assertSame(LanguageAlpha3Code.bod, LanguageAlpha3Code.tib.getAlpha3T());
    }


    @Test
    public void test25()
    {
        assertSame(LanguageAlpha3Code.tib, LanguageAlpha3Code.tib.getAlpha3B());
    }


    @Test
    public void test26()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.tib.getUsage());
    }


    @Test
    public void test27()
    {
        assertSame(LanguageAlpha3Code.baq, LanguageAlpha3Code.eus.getSynonym());
    }


    @Test
    public void test28()
    {
        assertSame(LanguageAlpha3Code.eus, LanguageAlpha3Code.eus.getAlpha3T());
    }


    @Test
    public void test29()
    {
        assertSame(LanguageAlpha3Code.baq, LanguageAlpha3Code.eus.getAlpha3B());
    }


    @Test
    public void test30()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.eus.getUsage());
    }


    @Test
    public void test31()
    {
        assertSame(LanguageAlpha3Code.eus, LanguageAlpha3Code.baq.getSynonym());
    }


    @Test
    public void test32()
    {
        assertSame(LanguageAlpha3Code.eus, LanguageAlpha3Code.baq.getAlpha3T());
    }


    @Test
    public void test33()
    {
        assertSame(LanguageAlpha3Code.baq, LanguageAlpha3Code.baq.getAlpha3B());
    }


    @Test
    public void test34()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.baq.getUsage());
    }


    @Test
    public void test35()
    {
        assertSame(LanguageAlpha3Code.cze, LanguageAlpha3Code.ces.getSynonym());
    }


    @Test
    public void test36()
    {
        assertSame(LanguageAlpha3Code.ces, LanguageAlpha3Code.ces.getAlpha3T());
    }


    @Test
    public void test37()
    {
        assertSame(LanguageAlpha3Code.cze, LanguageAlpha3Code.ces.getAlpha3B());
    }


    @Test
    public void test38()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.ces.getUsage());
    }


    @Test
    public void test39()
    {
        assertSame(LanguageAlpha3Code.ces, LanguageAlpha3Code.cze.getSynonym());
    }


    @Test
    public void test40()
    {
        assertSame(LanguageAlpha3Code.ces, LanguageAlpha3Code.cze.getAlpha3T());
    }


    @Test
    public void test41()
    {
        assertSame(LanguageAlpha3Code.cze, LanguageAlpha3Code.cze.getAlpha3B());
    }


    @Test
    public void test42()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.cze.getUsage());
    }


    @Test
    public void test43()
    {
        assertSame(LanguageAlpha3Code.wel, LanguageAlpha3Code.cym.getSynonym());
    }


    @Test
    public void test44()
    {
        assertSame(LanguageAlpha3Code.cym, LanguageAlpha3Code.cym.getAlpha3T());
    }


    @Test
    public void test45()
    {
        assertSame(LanguageAlpha3Code.wel, LanguageAlpha3Code.cym.getAlpha3B());
    }


    @Test
    public void test46()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.cym.getUsage());
    }


    @Test
    public void test47()
    {
        assertSame(LanguageAlpha3Code.cym, LanguageAlpha3Code.wel.getSynonym());
    }


    @Test
    public void test48()
    {
        assertSame(LanguageAlpha3Code.cym, LanguageAlpha3Code.wel.getAlpha3T());
    }


    @Test
    public void test49()
    {
        assertSame(LanguageAlpha3Code.wel, LanguageAlpha3Code.wel.getAlpha3B());
    }


    @Test
    public void test50()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.wel.getUsage());
    }


    @Test
    public void test51()
    {
        assertSame(LanguageAlpha3Code.ger, LanguageAlpha3Code.deu.getSynonym());
    }


    @Test
    public void test52()
    {
        assertSame(LanguageAlpha3Code.deu, LanguageAlpha3Code.deu.getAlpha3T());
    }


    @Test
    public void test53()
    {
        assertSame(LanguageAlpha3Code.ger, LanguageAlpha3Code.deu.getAlpha3B());
    }


    @Test
    public void test54()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.deu.getUsage());
    }


    @Test
    public void test55()
    {
        assertSame(LanguageAlpha3Code.deu, LanguageAlpha3Code.ger.getSynonym());
    }


    @Test
    public void test56()
    {
        assertSame(LanguageAlpha3Code.deu, LanguageAlpha3Code.ger.getAlpha3T());
    }


    @Test
    public void test57()
    {
        assertSame(LanguageAlpha3Code.ger, LanguageAlpha3Code.ger.getAlpha3B());
    }


    @Test
    public void test58()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.ger.getUsage());
    }


    @Test
    public void test59()
    {
        assertSame(LanguageAlpha3Code.gre, LanguageAlpha3Code.ell.getSynonym());
    }


    @Test
    public void test60()
    {
        assertSame(LanguageAlpha3Code.ell, LanguageAlpha3Code.ell.getAlpha3T());
    }


    @Test
    public void test61()
    {
        assertSame(LanguageAlpha3Code.gre, LanguageAlpha3Code.ell.getAlpha3B());
    }


    @Test
    public void test62()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.ell.getUsage());
    }


    @Test
    public void test63()
    {
        assertSame(LanguageAlpha3Code.ell, LanguageAlpha3Code.gre.getSynonym());
    }


    @Test
    public void test64()
    {
        assertSame(LanguageAlpha3Code.ell, LanguageAlpha3Code.gre.getAlpha3T());
    }


    @Test
    public void test65()
    {
        assertSame(LanguageAlpha3Code.gre, LanguageAlpha3Code.gre.getAlpha3B());
    }


    @Test
    public void test66()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.gre.getUsage());
    }


    @Test
    public void test67()
    {
        assertSame(LanguageAlpha3Code.per, LanguageAlpha3Code.fas.getSynonym());
    }


    @Test
    public void test68()
    {
        assertSame(LanguageAlpha3Code.fas, LanguageAlpha3Code.fas.getAlpha3T());
    }


    @Test
    public void test69()
    {
        assertSame(LanguageAlpha3Code.per, LanguageAlpha3Code.fas.getAlpha3B());
    }


    @Test
    public void test70()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.fas.getUsage());
    }


    @Test
    public void test71()
    {
        assertSame(LanguageAlpha3Code.fas, LanguageAlpha3Code.per.getSynonym());
    }


    @Test
    public void test72()
    {
        assertSame(LanguageAlpha3Code.fas, LanguageAlpha3Code.per.getAlpha3T());
    }


    @Test
    public void test73()
    {
        assertSame(LanguageAlpha3Code.per, LanguageAlpha3Code.per.getAlpha3B());
    }


    @Test
    public void test74()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.per.getUsage());
    }


    @Test
    public void test75()
    {
        assertSame(LanguageAlpha3Code.fre, LanguageAlpha3Code.fra.getSynonym());
    }


    @Test
    public void test76()
    {
        assertSame(LanguageAlpha3Code.fra, LanguageAlpha3Code.fra.getAlpha3T());
    }


    @Test
    public void test77()
    {
        assertSame(LanguageAlpha3Code.fre, LanguageAlpha3Code.fra.getAlpha3B());
    }


    @Test
    public void test78()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.fra.getUsage());
    }


    @Test
    public void test79()
    {
        assertSame(LanguageAlpha3Code.fra, LanguageAlpha3Code.fre.getSynonym());
    }


    @Test
    public void test80()
    {
        assertSame(LanguageAlpha3Code.fra, LanguageAlpha3Code.fre.getAlpha3T());
    }


    @Test
    public void test81()
    {
        assertSame(LanguageAlpha3Code.fre, LanguageAlpha3Code.fre.getAlpha3B());
    }


    @Test
    public void test82()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.fre.getUsage());
    }


    @Test
    public void test83()
    {
        assertSame(LanguageAlpha3Code.arm, LanguageAlpha3Code.hye.getSynonym());
    }


    @Test
    public void test84()
    {
        assertSame(LanguageAlpha3Code.hye, LanguageAlpha3Code.hye.getAlpha3T());
    }


    @Test
    public void test85()
    {
        assertSame(LanguageAlpha3Code.arm, LanguageAlpha3Code.hye.getAlpha3B());
    }


    @Test
    public void test86()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.hye.getUsage());
    }


    @Test
    public void test87()
    {
        assertSame(LanguageAlpha3Code.hye, LanguageAlpha3Code.arm.getSynonym());
    }


    @Test
    public void test88()
    {
        assertSame(LanguageAlpha3Code.hye, LanguageAlpha3Code.arm.getAlpha3T());
    }


    @Test
    public void test89()
    {
        assertSame(LanguageAlpha3Code.arm, LanguageAlpha3Code.arm.getAlpha3B());
    }


    @Test
    public void test90()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.arm.getUsage());
    }


    @Test
    public void test91()
    {
        assertSame(LanguageAlpha3Code.ice, LanguageAlpha3Code.isl.getSynonym());
    }


    @Test
    public void test92()
    {
        assertSame(LanguageAlpha3Code.isl, LanguageAlpha3Code.isl.getAlpha3T());
    }


    @Test
    public void test93()
    {
        assertSame(LanguageAlpha3Code.ice, LanguageAlpha3Code.isl.getAlpha3B());
    }


    @Test
    public void test94()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.isl.getUsage());
    }


    @Test
    public void test95()
    {
        assertSame(LanguageAlpha3Code.isl, LanguageAlpha3Code.ice.getSynonym());
    }


    @Test
    public void test96()
    {
        assertSame(LanguageAlpha3Code.isl, LanguageAlpha3Code.ice.getAlpha3T());
    }


    @Test
    public void test97()
    {
        assertSame(LanguageAlpha3Code.ice, LanguageAlpha3Code.ice.getAlpha3B());
    }


    @Test
    public void test98()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.ice.getUsage());
    }


    @Test
    public void test99()
    {
        assertSame(LanguageAlpha3Code.geo, LanguageAlpha3Code.kat.getSynonym());
    }


    @Test
    public void test100()
    {
        assertSame(LanguageAlpha3Code.kat, LanguageAlpha3Code.kat.getAlpha3T());
    }


    @Test
    public void test101()
    {
        assertSame(LanguageAlpha3Code.geo, LanguageAlpha3Code.kat.getAlpha3B());
    }


    @Test
    public void test102()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.kat.getUsage());
    }


    @Test
    public void test103()
    {
        assertSame(LanguageAlpha3Code.kat, LanguageAlpha3Code.geo.getSynonym());
    }


    @Test
    public void test104()
    {
        assertSame(LanguageAlpha3Code.kat, LanguageAlpha3Code.geo.getAlpha3T());
    }


    @Test
    public void test105()
    {
        assertSame(LanguageAlpha3Code.geo, LanguageAlpha3Code.geo.getAlpha3B());
    }


    @Test
    public void test106()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.geo.getUsage());
    }


    @Test
    public void test107()
    {
        assertSame(LanguageAlpha3Code.mao, LanguageAlpha3Code.mri.getSynonym());
    }


    @Test
    public void test108()
    {
        assertSame(LanguageAlpha3Code.mri, LanguageAlpha3Code.mri.getAlpha3T());
    }


    @Test
    public void test109()
    {
        assertSame(LanguageAlpha3Code.mao, LanguageAlpha3Code.mri.getAlpha3B());
    }


    @Test
    public void test110()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.mri.getUsage());
    }


    @Test
    public void test111()
    {
        assertSame(LanguageAlpha3Code.mri, LanguageAlpha3Code.mao.getSynonym());
    }


    @Test
    public void test112()
    {
        assertSame(LanguageAlpha3Code.mri, LanguageAlpha3Code.mao.getAlpha3T());
    }


    @Test
    public void test113()
    {
        assertSame(LanguageAlpha3Code.mao, LanguageAlpha3Code.mao.getAlpha3B());
    }


    @Test
    public void test114()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.mao.getUsage());
    }


    @Test
    public void test115()
    {
        assertSame(LanguageAlpha3Code.mac, LanguageAlpha3Code.mkd.getSynonym());
    }


    @Test
    public void test116()
    {
        assertSame(LanguageAlpha3Code.mkd, LanguageAlpha3Code.mkd.getAlpha3T());
    }


    @Test
    public void test117()
    {
        assertSame(LanguageAlpha3Code.mac, LanguageAlpha3Code.mkd.getAlpha3B());
    }


    @Test
    public void test118()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.mkd.getUsage());
    }


    @Test
    public void test119()
    {
        assertSame(LanguageAlpha3Code.mkd, LanguageAlpha3Code.mac.getSynonym());
    }


    @Test
    public void test120()
    {
        assertSame(LanguageAlpha3Code.mkd, LanguageAlpha3Code.mac.getAlpha3T());
    }


    @Test
    public void test121()
    {
        assertSame(LanguageAlpha3Code.mac, LanguageAlpha3Code.mac.getAlpha3B());
    }


    @Test
    public void test122()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.mac.getUsage());
    }


    @Test
    public void test123()
    {
        assertSame(LanguageAlpha3Code.may, LanguageAlpha3Code.msa.getSynonym());
    }


    @Test
    public void test124()
    {
        assertSame(LanguageAlpha3Code.msa, LanguageAlpha3Code.msa.getAlpha3T());
    }


    @Test
    public void test125()
    {
        assertSame(LanguageAlpha3Code.may, LanguageAlpha3Code.msa.getAlpha3B());
    }


    @Test
    public void test126()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.msa.getUsage());
    }


    @Test
    public void test127()
    {
        assertSame(LanguageAlpha3Code.msa, LanguageAlpha3Code.may.getSynonym());
    }


    @Test
    public void test128()
    {
        assertSame(LanguageAlpha3Code.msa, LanguageAlpha3Code.may.getAlpha3T());
    }


    @Test
    public void test129()
    {
        assertSame(LanguageAlpha3Code.may, LanguageAlpha3Code.may.getAlpha3B());
    }


    @Test
    public void test130()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.may.getUsage());
    }


    @Test
    public void test131()
    {
        assertSame(LanguageAlpha3Code.bur, LanguageAlpha3Code.mya.getSynonym());
    }


    @Test
    public void test132()
    {
        assertSame(LanguageAlpha3Code.mya, LanguageAlpha3Code.mya.getAlpha3T());
    }


    @Test
    public void test133()
    {
        assertSame(LanguageAlpha3Code.bur, LanguageAlpha3Code.mya.getAlpha3B());
    }


    @Test
    public void test134()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.mya.getUsage());
    }


    @Test
    public void test135()
    {
        assertSame(LanguageAlpha3Code.mya, LanguageAlpha3Code.bur.getSynonym());
    }


    @Test
    public void test136()
    {
        assertSame(LanguageAlpha3Code.mya, LanguageAlpha3Code.bur.getAlpha3T());
    }


    @Test
    public void test137()
    {
        assertSame(LanguageAlpha3Code.bur, LanguageAlpha3Code.bur.getAlpha3B());
    }


    @Test
    public void test138()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.bur.getUsage());
    }


    @Test
    public void test139()
    {
        assertSame(LanguageAlpha3Code.dut, LanguageAlpha3Code.nld.getSynonym());
    }


    @Test
    public void test140()
    {
        assertSame(LanguageAlpha3Code.nld, LanguageAlpha3Code.nld.getAlpha3T());
    }


    @Test
    public void test141()
    {
        assertSame(LanguageAlpha3Code.dut, LanguageAlpha3Code.nld.getAlpha3B());
    }


    @Test
    public void test142()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.nld.getUsage());
    }


    @Test
    public void test143()
    {
        assertSame(LanguageAlpha3Code.nld, LanguageAlpha3Code.dut.getSynonym());
    }


    @Test
    public void test144()
    {
        assertSame(LanguageAlpha3Code.nld, LanguageAlpha3Code.dut.getAlpha3T());
    }


    @Test
    public void test145()
    {
        assertSame(LanguageAlpha3Code.dut, LanguageAlpha3Code.dut.getAlpha3B());
    }


    @Test
    public void test146()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.dut.getUsage());
    }


    @Test
    public void test147()
    {
        assertSame(LanguageAlpha3Code.rum, LanguageAlpha3Code.ron.getSynonym());
    }


    @Test
    public void test148()
    {
        assertSame(LanguageAlpha3Code.ron, LanguageAlpha3Code.ron.getAlpha3T());
    }


    @Test
    public void test149()
    {
        assertSame(LanguageAlpha3Code.rum, LanguageAlpha3Code.ron.getAlpha3B());
    }


    @Test
    public void test150()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.ron.getUsage());
    }


    @Test
    public void test151()
    {
        assertSame(LanguageAlpha3Code.ron, LanguageAlpha3Code.rum.getSynonym());
    }


    @Test
    public void test152()
    {
        assertSame(LanguageAlpha3Code.ron, LanguageAlpha3Code.rum.getAlpha3T());
    }


    @Test
    public void test153()
    {
        assertSame(LanguageAlpha3Code.rum, LanguageAlpha3Code.rum.getAlpha3B());
    }


    @Test
    public void test154()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.rum.getUsage());
    }


    @Test
    public void test155()
    {
        assertSame(LanguageAlpha3Code.slo, LanguageAlpha3Code.slk.getSynonym());
    }


    @Test
    public void test156()
    {
        assertSame(LanguageAlpha3Code.slk, LanguageAlpha3Code.slk.getAlpha3T());
    }


    @Test
    public void test157()
    {
        assertSame(LanguageAlpha3Code.slo, LanguageAlpha3Code.slk.getAlpha3B());
    }


    @Test
    public void test158()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.slk.getUsage());
    }


    @Test
    public void test159()
    {
        assertSame(LanguageAlpha3Code.slk, LanguageAlpha3Code.slo.getSynonym());
    }


    @Test
    public void test160()
    {
        assertSame(LanguageAlpha3Code.slk, LanguageAlpha3Code.slo.getAlpha3T());
    }


    @Test
    public void test161()
    {
        assertSame(LanguageAlpha3Code.slo, LanguageAlpha3Code.slo.getAlpha3B());
    }


    @Test
    public void test162()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.slo.getUsage());
    }


    @Test
    public void test163()
    {
        assertSame(LanguageAlpha3Code.alb, LanguageAlpha3Code.sqi.getSynonym());
    }


    @Test
    public void test164()
    {
        assertSame(LanguageAlpha3Code.sqi, LanguageAlpha3Code.sqi.getAlpha3T());
    }


    @Test
    public void test165()
    {
        assertSame(LanguageAlpha3Code.alb, LanguageAlpha3Code.sqi.getAlpha3B());
    }


    @Test
    public void test166()
    {
        assertSame(TERMINOLOGY, LanguageAlpha3Code.sqi.getUsage());
    }


    @Test
    public void test167()
    {
        assertSame(LanguageAlpha3Code.sqi, LanguageAlpha3Code.alb.getSynonym());
    }


    @Test
    public void test168()
    {
        assertSame(LanguageAlpha3Code.sqi, LanguageAlpha3Code.alb.getAlpha3T());
    }


    @Test
    public void test169()
    {
        assertSame(LanguageAlpha3Code.alb, LanguageAlpha3Code.alb.getAlpha3B());
    }


    @Test
    public void test170()
    {
        assertSame(BIBLIOGRAPHY, LanguageAlpha3Code.alb.getUsage());
    }


    @Test
    public void test171()
    {
        assertSame(LanguageAlpha3Code.jpn, LanguageAlpha3Code.jpn.getSynonym());
    }


    @Test
    public void test172()
    {
        assertSame(LanguageAlpha3Code.jpn, LanguageAlpha3Code.jpn.getAlpha3T());
    }


    @Test
    public void test173()
    {
        assertSame(LanguageAlpha3Code.jpn, LanguageAlpha3Code.jpn.getAlpha3B());
    }


    @Test
    public void test174()
    {
        assertSame(COMMON, LanguageAlpha3Code.jpn.getUsage());
    }


    @Test
    public void test175()
    {
        assertSame("Japanese", LanguageAlpha3Code.jpn.getName());
    }


    @Test
    public void test176()
    {
        assertSame(LanguageAlpha3Code.New, getByCode("New", true));
    }


    @Test
    public void test177()
    {
        assertSame(LanguageAlpha3Code.New, getByCode("new", true));
    }


    @Test
    public void test178()
    {
        assertNull(getByCode("NEW", true));
    }


    @Test
    public void test179()
    {
        assertEquals("new", LanguageAlpha3Code.New.toString());
    }


    @Test
    public void test180()
    {
        List<LanguageAlpha3Code> list = LanguageAlpha3Code.findByName("Old.*");

        assertEquals(7, list.size());

        // ang : Old English
        assertTrue(list.contains(LanguageAlpha3Code.ang));

        // fro : Old French
        assertTrue(list.contains(LanguageAlpha3Code.fro));

        // goh : Old High German
        assertTrue(list.contains(LanguageAlpha3Code.goh));

        // non : Old Norse
        assertTrue(list.contains(LanguageAlpha3Code.non));

        // peo : Old Persian
        assertTrue(list.contains(LanguageAlpha3Code.peo));

        // pro : Old Provencal
        assertTrue(list.contains(LanguageAlpha3Code.pro));

        // sga : Old Irish
        assertTrue(list.contains(LanguageAlpha3Code.fro));
    }


    @Test
    public void test181()
    {
        assertSame(LanguageAlpha3Code.undefined, getByCode("undefined"));
    }


    @Test
    public void test182()
    {
        assertNull(getByCode("UNDEFINED"));
    }


    @Test
    public void test183()
    {
        assertSame(LanguageAlpha3Code.undefined, getByCode("UNDEFINED", false));
    }
}
