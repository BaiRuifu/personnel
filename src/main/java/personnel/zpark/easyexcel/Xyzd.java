//package personnel.zpark.easyexcel;
//
//import cn.archer.mapper.BreedingMapper;
//import cn.archer.mapper.FarmNameMapper;
//import cn.archer.mapper.SearchMapper;
//import cn.archer.mapper.XyzdMapper;
//import cn.archer.mapper.XzzdMapper;
//import cn.archer.pojo.FarmName;
//import static cn.archer.utils.MyStaticMethod.NowTime;
//import static cn.archer.utils.MyStaticMethod.calInterval;
//import static cn.archer.utils.MyStaticMethod.minusDate;
//import static cn.archer.utils.MyStaticMethod.textIsTrue;
//import cn.archer.utils.MybatisUtil;
//import cn.zd.app.Main2App;
//import static cn.zd.app.Main2App.lineidIdtoNameSmap;
//import static cn.zd.app.Main2App.swintypeIdtoNameSmap;
//import java.awt.Desktop;
//import java.io.File;
//import java.io.IOException;
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Set;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JFileChooser;
//import javax.swing.JOptionPane;
//import javax.swing.RowSorter;
//import javax.swing.filechooser.FileNameExtensionFilter;
//import javax.swing.plaf.basic.BasicInternalFrameUI;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableModel;
//import javax.swing.table.TableRowSorter;
//import jxl.Workbook;
//import jxl.format.*;
//import jxl.write.Label;
//import jxl.write.WritableCellFormat;
//import jxl.write.WritableFont;
//import jxl.write.WritableSheet;
//import jxl.write.WritableWorkbook;
//import jxl.write.WriteException;
//import org.apache.ibatis.session.SqlSession;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
///**
// * 综合育种分析
// *
// * FileDialog loadDia 文件 double Sum1 double Sum2 static ReadText readText 读文件
// *
// * ArrayList titleheads1 待选表 ArrayList titleheads2 已选表
// *
// * Object nowModel 当前方法 FilePhe fp 文件处理对象
// *
// * @author Administrator
// */
//public class Xyzd extends javax.swing.JInternalFrame {
//
//    private ArrayList<String> titleheads1;
//    private ArrayList<String> titleheads1SQL;
//    private ArrayList<String> titleheads2;
//    private ArrayList<Boolean> jiangxu2;
//    private List<String> r_animalsM;
//    private List<String> r_animalsG;
//
//    private double[][] A;
//    private List<String> r_animals;
//    private double jjxsYz = 0.005;
//    private int cjjgts = 5;
//    private ArrayList<String> selectedXX;
//    private ArrayList<Boolean> selectedXX_DESC;
//    private ArrayList<String> XXname;
//    private ArrayList<String> XXSQL;
//    public Main2App main2app;
//    private boolean dayuJJXS = true;
//    private boolean quanxuanGZ = false;
//
//    public Xyzd(Main2App main2app) {
//        ((BasicInternalFrameUI) getUI()).setNorthPane(null);
//        //this.setVisible(true);
//        initComponents();
//        this.main2app = main2app;
//
//    }
//
//    //初始化
//    public void setData() {
//
//        jButton3.setEnabled(false);
//        jButton6.setEnabled(false);
//
//        titleheads1 = new ArrayList<>();
//        titleheads2 = new ArrayList<>();
//        jiangxu2 = new ArrayList<>();
//
//        jTable1.setModel(new DefaultTableModel(
//                new Object[][]{
//                    {"1", "综合育种值"},
//                    {"2", "左乳头数"}, {"3", "右乳头数"}, {"4", "初生重"},
//                    {"5", "本窝哺乳期成活率"}, {"6", "生母哺乳期成活率"}, {"7", "总仔数"}, {"8", "活仔数"}, {"9", "断奶窝重"}, {"10", "窝均匀度"}, {"11", "校正21日龄窝重"}, {"12", "带仔行为"},
//                    {"13", "哺乳期死仔数"}, {"14", "产程表现"}, {"15", "产后5日龄活仔数"}, {"16", "哺乳期采食量"},
//                    {"17", "与配精液评级"},
//                    {"18", "校正目标体重日龄"}, {"19", "校正背膘厚"},
//                    {"20", "校正眼肌"}, {"21", "校正料肉比"}, {"22", "肌内脂肪"},
//                    {"23", "屠宰率"}, {"24", "胴体重"}, {"25", "肋骨数"}, {"26", "膘厚"},
//                    {"27", "前躯占比"}, {"28", "中躯占比"}, {"29", "后躯占比"}, {"30", "肌肉颜色"}, {"31", "大理石纹评分"}, {"32", "PH值"}, {"33", "眼肌面积"}, {"34", "滴水损失"}
//                }, new String[]{"序号", "待选信息"}) {
//            boolean[] canEdit = new boolean[]{
//                false, false
//            };
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit[columnIndex];
//            }
//        });
//        if (jTable1.getColumnModel().getColumnCount() > 0) {
//            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
//        }
////        jTable2.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"已选信息"}){
////            boolean[] canEdit = new boolean[]{
////                false
////            };
////
////            public boolean isCellEditable(int rowIndex, int columnIndex) {
////                return canEdit[columnIndex];
////            }
////
////        });
//
//        String[] name = {
//            "综合育种值",
//            "左乳头数", "右乳头数", "初生重",
//            "本窝哺乳期成活率", "生母哺乳期成活率", "总仔数", "活仔数", "断奶窝重", "窝均匀度", "校正21日龄窝重", "带仔行为",
//            "哺乳期死仔数", "产程表现", "产后5日龄活仔数", "哺乳期采食量",
//            "与配精液评级",
//            "校正目标体重日龄", "校正背膘厚",
//            "校正眼肌", "校正料肉比", "肌内脂肪",
//            "屠宰率", "胴体重", "肋骨数", "膘厚",
//            "前躯占比", "中躯占比", "后躯占比", "肌肉颜色", "大理石纹评分", "PH值", "眼肌面积", "滴水损失"
//        };
//        String[] SQL = {
//            "zhyzz",
//            "r_nipple1", "r_nipple2", "r_bthwt",
//            "bwbrqchl", "smbrqchl", "zczs", "czhs", "dnwz", "wjyd", "jz21rlwz", "dzxw",
//            "brqtwszs", "ccbx", "ch5rlhzs", "brqcsl",
//            "ypjypj",
//            "jzmbtzrl", "jzbbh", "jzyj", "jzlrb", "jnzf",
//            "tzl", "ttz", "lgs", "bh",
//            "qqzb", "zqzb", "hqzb", "jrys", "dlsw", "ph1", "yjmj", "dsss"
//        };
//
//        titleheads1 = new ArrayList(Arrays.asList(name));
//        titleheads1SQL = new ArrayList(Arrays.asList(SQL));
//        XXname = (ArrayList) titleheads1.clone();
//        XXSQL = (ArrayList) titleheads1SQL.clone();
//
//        //初始化公猪列表
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            SearchMapper searchMapper = sqlSession.getMapper(SearchMapper.class);
//            r_animalsG = searchMapper.XyzdGzSelect(minusDate(NowTime(), 1460), NowTime());
//            sqlSession.close();
//        }
//
//        //计算近四年内近交系数平均值
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            XyzdMapper xyzdMapper = sqlSession.getMapper(XyzdMapper.class);
//            List<Double> fourYearsJJXS = xyzdMapper.select4YcnzzJJXS(minusDate(NowTime(), 1460), NowTime());
//            sqlSession.close();
//            double sum = 0;
//            for (Double jjxs : fourYearsJJXS) {
//                if (jjxs == null) {
//                    continue;
//                }
//                sum += jjxs;
//            }
//            jLabel8.setText("在场种猪平均近交系数：" + sum / fourYearsJJXS.size());
//        }
//    }
//
//    /**
//     * *
//     * 母猪选择
//     *
//     * @param startDate
//     * @param endDate
//     */
//    public void selectR_animal(String startDate, String endDate) {
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            SearchMapper searchMapper = sqlSession.getMapper(SearchMapper.class);
//            r_animalsM = searchMapper.XyzdMzSelect(startDate, endDate);
//            sqlSession.close();
//        }
//
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            XyzdMapper xyzdMapper = sqlSession.getMapper(XyzdMapper.class);
//            Object[][] tableModel = new Object[r_animalsM.size()][4];
//            for (int i = 0; i < r_animalsM.size(); i++) {
//                HashMap<String, String> selebithM = xyzdMapper.selectXyzdMzXx(r_animalsM.get(i));
//                tableModel[i][0] = r_animalsM.get(i);
//                tableModel[i][1] = swintypeIdtoNameSmap.get(selebithM.get("r_curmark"));
//                tableModel[i][2] = selebithM.get("r_fdate");
//                tableModel[i][3] = true;
//            }
//            jTable3.setModel(new DefaultTableModel(
//                    tableModel,
//                    new String[]{
//                        "母猪编号", "当前状态", "出生日期", "选择"
//                    }
//            ) {
//                Class[] types = new Class[]{
//                    Object.class, Object.class, Object.class, Boolean.class
//                };
//                boolean[] canEdit = new boolean[]{
//                    false, false, false, true
//                };
//
//                public Class getColumnClass(int columnIndex) {
//                    return types[columnIndex];
//                }
//
//                @Override
//                public boolean isCellEditable(int rowIndex, int columnIndex) {
//                    return canEdit[columnIndex];
//                }
//            });
//
//            if (jTable3.getColumnModel().getColumnCount() > 0) {
//                jTable3.getColumnModel().getColumn(2).setPreferredWidth(100);
//                jTable3.getColumnModel().getColumn(2).setMaxWidth(100);
//                jTable3.getColumnModel().getColumn(3).setMaxWidth(50);
//            }
//        }
//        card.show(jPanel0, "card1");
//    }
//
//    //添加和移除的刷新12表
//    private void refreshJTable() {
//
//        //刷新待选表
//        Object[][] tableModel = new Object[titleheads1.size()][2];
//        for (int i = 0; i < titleheads1.size(); i++) {
//            tableModel[i][0] = i + 1;
//            tableModel[i][1] = titleheads1.get(i);
//        }
//
//        //刷新已选表
//        Object[][] tableModel2 = new Object[titleheads2.size()][2];
//        for (int i = 0; i < titleheads2.size(); i++) {
//            tableModel2[i][0] = titleheads2.get(i);
//            tableModel2[i][1] = jiangxu2.get(i);
//        }
//
//        jTable1.setModel(new DefaultTableModel(tableModel, new String[]{"序号", "待选信息"}) {
//            boolean[] canEdit = new boolean[]{
//                false, false
//            };
//
//            @Override
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit[columnIndex];
//            }
//        });
//        if (jTable1.getColumnModel().getColumnCount() > 0) {
//            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
//        }
//
//        jTable2.setModel(new DefaultTableModel(tableModel2, new String[]{"已选信息", "降序"}) {
//            Class[] types = new Class[]{
//                Object.class, Boolean.class
//            };
//            boolean[] canEdit = new boolean[]{
//                false, true
//            };
//
//            public Class getColumnClass(int columnIndex) {
//                return types[columnIndex];
//            }
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit[columnIndex];
//            }
//
//        });
//        if (jTable2.getColumnModel().getColumnCount() > 0) {
//            jTable2.getColumnModel().getColumn(1).setMaxWidth(50);
//        }
//
//    }
//
//    /**
//     * *
//     * 计算四年内所有猪的近交系数
//     *
//     */
//    private void getJJXS() {
//        //得到四年内所有猪的编号
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            SearchMapper searchMapper = sqlSession.getMapper(SearchMapper.class);
//            r_animals = searchMapper.XzzdZzSelect("%", "%", "2018-01-01", "2020-02-02", "", "selebith", "selebith.r_fdate");
//        }
//
//        //性状
//        LinkedHashMap<String, String[]> xpjg = new LinkedHashMap<>();
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            XzzdMapper xzzdMapper = sqlSession.getMapper(XzzdMapper.class);
//            LinkedHashMap r_JBXX;
//            String SQL = "r_animal,r_sire,r_dam";
//            for (int i = 0; i < r_animals.size(); i++) {
//                r_JBXX = xzzdMapper.selectXZZDXX(SQL, r_animals.get(i));
//                //添加到系谱结构
//                String[] fm = {i + "", (String) r_JBXX.get("r_sire"), (String) r_JBXX.get("r_dam")};
//                xpjg.put((String) r_JBXX.get("r_animal"), fm);
//            }
//            sqlSession.close();
//        }
//        ArrayList<int[]> xp = Xpjg.toNum(xpjg);
//        A = ComputeA.computeA(xp.get(0), xp.get(1));
//
//        System.out.println("所有猪只近交系数");
//        for (int i = 0; i < A.length; i++) {
//            System.out.print(r_animals.get(i) + "\t");
//            for (int j = 0; j < A[i].length; j++) {
//                System.out.print(A[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("========================");
//        System.out.println("========================");
//        System.out.println("========================");
//        System.out.println("========================");
//    }
//
//    /**
//     * *
//     * 计算四年内所有种猪的亲缘关系
//     *
//     */
//    private void getZZQYGX() {
//        //得到四年内所有种猪的编号
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            SearchMapper searchMapper = sqlSession.getMapper(SearchMapper.class);
//            r_animals = searchMapper.XyzdZzSelect(minusDate(NowTime(), 1460), NowTime());
//        }
//
//        //性状
//        LinkedHashMap<String, String[]> xpjg = new LinkedHashMap<>();
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            XzzdMapper xzzdMapper = sqlSession.getMapper(XzzdMapper.class);
//            LinkedHashMap r_JBXX;
//            String SQL = "r_animal,r_sire,r_dam";
//            for (int i = 0; i < r_animals.size(); i++) {
//                r_JBXX = xzzdMapper.selectXZZDXX(SQL, r_animals.get(i));
//                //添加到系谱结构
//                String[] fm = {i + "", (String) r_JBXX.get("r_sire"), (String) r_JBXX.get("r_dam")};
////                String[] fm = { i+1+"" , (String)r_JBXX.get("r_sire"), (String)r_JBXX.get("r_dam")};
//                xpjg.put((String) r_JBXX.get("r_animal"), fm);
//            }
//            sqlSession.close();
//        }
//        ArrayList<int[]> xp = Xpjg.toNum(xpjg);
//        A = ComputeA.computeA(xp.get(0), xp.get(1));
////        System.out.println("所有种猪近交系数");
////        for(int i=0;i<A.length;i++){
////            System.out.print(r_animals.get(i) + "\t");
////            for(int j=0;j<A[i].length;j++){
////                System.out.print(A[i][j] + "\t");
////            }
////            System.out.println();
////        }
//    }
//
//    /**
//     * 将指定猪只的近交系数更新到个体信息表里
//     *
//     * @param sqlSession
//     * @param r_animal
//     * @return
//     */
//    public boolean updateJJXS(SqlSession sqlSession, String r_animal) {
//        try {
//            int index = r_animals.indexOf(r_animal);
//            double qygx = A[index][index];
//            XzzdMapper xzzdMapper = sqlSession.getMapper(XzzdMapper.class);
//            xzzdMapper.updateJJXS(r_animal, (float) qygx - 1);
//            sqlSession.commit();
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//
//    /**
//     * 将给定母猪与所有已选公猪进行模拟配对，计算其所产仔猪的近交系数
//     *
//     * @param r_animalM
//     * @return
//     */
//    public LinkedHashMap<String, Double[]> simBreed(String r_animalM) {
//        LinkedHashMap<String, Double[]> canBreed = new LinkedHashMap();
//        int indexM = r_animals.indexOf(r_animalM);
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            XyzdMapper xyzdMapper = sqlSession.getMapper(XyzdMapper.class);
//            double jjxsM;
//            try {
//                jjxsM = xyzdMapper.selectJJXSbyID(r_animalM);
//            } catch (Exception e) {
//                try {
//                    boolean f = updateJJXS(sqlSession, r_animalM);
//                    System.out.println("ffff=" + f);
//                    jjxsM = xyzdMapper.selectJJXSbyID(r_animalM);
//                } catch (Exception ee) {
//                    jjxsM = 0;
//                }
//            }
//            for (String r_animalG : r_animalsG) {
//                int indexG = r_animals.indexOf(r_animalG);
//
//                //计算仔猪的近交系数
//                double qyxsFM = A[indexG][indexM]; //F和M的亲缘系数
//                double jjxsF;
//                try {
//                    jjxsF = xyzdMapper.selectJJXSbyID(r_animalG);
//                } catch (Exception e) {
//                    try {
//                        boolean f = updateJJXS(sqlSession, r_animalG);
//                        System.out.println("ffff=" + f);
//                        jjxsF = xyzdMapper.selectJJXSbyID(r_animalG);
//                    } catch (Exception ee) {
//                        jjxsF = 0;
//                    }
//                }
//                double jjxsA = (qyxsFM * Math.sqrt((1 + jjxsF) * (1 + jjxsM))) / 2;
//                //保留6位
//                if (dayuJJXS) {
//                    if (jjxsA >= jjxsYz) {
//                        Double[] d = new Double[selectedXX.size() + 1];
//                        d[0] = jjxsA;
//                        canBreed.put(r_animalG, d);
//                    }
//                } else if (jjxsA <= jjxsYz) {
//                    Double[] d = new Double[selectedXX.size() + 1];
//                    d[0] = jjxsA;
//                    canBreed.put(r_animalG, d);
//                }
//            }
//
//        }
//        return canBreed;
//    }
//
//    /**
//     * 将给定母猪与所有已选公猪进行模拟配对，计算其所产仔猪的近交系数
//     *
//     * @param r_animalM
//     * @param allJJXS
//     * @return
//     */
//    public LinkedHashMap<String, Double[]> simBreed1(String r_animalM, LinkedHashMap<String, Double[]> allJJXS) {
////        LinkedHashMap<String, Double[]> canBreed = new LinkedHashMap();
//        int indexM = r_animals.indexOf(r_animalM);
//        System.out.println("indexM=" + indexM);
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            XyzdMapper xyzdMapper = sqlSession.getMapper(XyzdMapper.class);
//            double jjxsM;
//            try {
//                jjxsM = xyzdMapper.selectJJXSbyID(r_animalM);
//            } catch (Exception e) {
//                try {
//                    boolean f = updateJJXS(sqlSession, r_animalM);
//                    System.out.println("ffff=" + f);
//                    jjxsM = xyzdMapper.selectJJXSbyID(r_animalM);
//                } catch (Exception ee) {
//                    jjxsM = 0;
//                }
//            }
//            Double[] d = new Double[r_animalsG.size()];
//            int i = 0;
//            System.out.println("r_animalsG" + r_animalsG.toString());
//            for (String r_animalG : r_animalsG) {
//                int indexG = r_animals.indexOf(r_animalG);
//                System.out.println("indexG=" + indexG);
//                //计算仔猪的近交系数
//                double qyxsFM = A[indexG][indexM]; //F和M的亲缘系数
//                double jjxsF;
//                try {
//                    jjxsF = xyzdMapper.selectJJXSbyID(r_animalG);
//                } catch (Exception e) {
//                    try {
//                        boolean f = updateJJXS(sqlSession, r_animalG);
//                        System.out.println("ffff=" + f);
//                        jjxsF = xyzdMapper.selectJJXSbyID(r_animalG);
//                    } catch (Exception ee) {
//                        jjxsF = 0;
//                    }
//                }
//                double jjxsA = (qyxsFM * Math.sqrt((1 + jjxsF) * (1 + jjxsM))) / 2;
//                //保留6位
//
//                d[i] = jjxsA;
//                i++;
////                canBreed.get(r_animalM)[0] = jjxsA;
//
////                if (dayuJJXS) {
////                    if (jjxsA >= jjxsYz) {
////                        Double[] d = new Double[selectedXX.size() + 1];
////                        d[0] = jjxsA;
////                        canBreed.put(r_animalG, d);
////                    }
////                } else if (jjxsA <= jjxsYz) {
////                    Double[] d = new Double[selectedXX.size() + 1];
////                    d[0] = jjxsA;
////                    canBreed.put(r_animalG, d);
////                }
//            }
//            allJJXS.put(r_animalM, d);
//
//        }
//        return allJJXS;
//    }
//
//    /**
//     * *
//     * 根据母猪编号， 筛选近交系数在阈值以下的公猪
//     */
//    private HashMap<String, Double> selectJJXSYZ(String selebithM) {
//        int indexM = r_animals.indexOf(selebithM);
//        HashMap<String, Double> jjxs = new HashMap();
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            XyzdMapper xyzdMapper = sqlSession.getMapper(XyzdMapper.class);
//            for (int i = 0; i < A[indexM].length; i++) {
//                if (A[indexM][i] < jjxsYz
//                        && r_animalsG.contains(r_animals.get(i))) {
//                    jjxs.put(r_animals.get(i), A[indexM][i]);
//                }
//            }
//        }
//        return jjxs;
//    }
//
//    /**
//     * *
//     * 筛选采精间隔5天以上的公猪
//     */
//    private LinkedHashMap<String, Double[]> selectCJJG(LinkedHashMap<String, Double[]> GZXX) {
//
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            XyzdMapper xyzdMapper = sqlSession.getMapper(XyzdMapper.class);
//            Set<String> s = GZXX.keySet();
//            Iterator<String> iterator = s.iterator();
//            while (iterator.hasNext()) {
//                String r_animal = iterator.next();
//                String cjrq = xyzdMapper.selectCJJG(r_animal);
//                if (cjrq == null) {
//                    continue;
//                }
//                int days = calInterval(cjrq, NowTime());
//                if (days <= this.cjjgts) {
//                    iterator.remove();
////                    GZXX.remove(r_animal);
//                }
//            }
//        }
//
//        return GZXX;
//    }
//
//    /**
//     * *
//     * 更新已选信息
//     */
//    private void updateXX() {
//
//        System.out.println("=====");
//        System.out.println(XXname.toString());
//
//        selectedXX = new ArrayList();
//        selectedXX_DESC = new ArrayList();
//        for (int i = 0; i < jTable2.getRowCount(); i++) {
//            String selectedItem = (String) jTable2.getValueAt(i, 0);
//            System.out.println(selectedItem);
//            selectedXX.add(XXSQL.get(XXname.indexOf(selectedItem)));
//            selectedXX_DESC.add((Boolean) jTable2.getValueAt(i, 1));
//            System.out.println("updateXX" + jTable2.getValueAt(i, 0) + "\t" + jTable2.getValueAt(i, 1));
//        }
//    }
//
//    /**
//     * *
//     * select猪只的6个已选信息
//     */
//    private LinkedHashMap<String, Double[]> selectSix(LinkedHashMap<String, Double[]> r_animals) {
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            XyzdMapper xyzdMapper = sqlSession.getMapper(XyzdMapper.class);
////            HashMap<String, Double[]> gzXX = new HashMap();//猪只信息Map
//
//            Set<String> s = r_animals.keySet();
//            for (String r_animal : s) {
//                Double[] ebv = r_animals.get(r_animal);
////                ebv[0] = jjxs.get(r_animal);
//                for (int i = 1; i < ebv.length; i++) {
//                    ebv[i] = xyzdMapper.selectEBV(r_animal, selectedXX.get(i - 1));
//                }
//                r_animals.replace(r_animal, ebv);
//                System.out.println("猪只信息:" + r_animal + "\t" + Arrays.toString(ebv));
//            }
//            return r_animals;
//        }
//    }
//
//    /**
//     * 将公猪信息以降序/升序排列，并筛选前10头
//     *
//     * @param gzXX
//     * @return
//     */
//    private LinkedHashMap<String, Double[]> sortGZXX(LinkedHashMap<String, Double[]> gzXX) {
//
////        Set<String> ff = gzXX.keySet();
////        for(String ss : ff){
////            System.out.println("---" + ss + "---");
////            System.out.println("\t" + Arrays.toString(gzXX.get(ss)));
////        }
//        String maxGz = "";
//        LinkedHashMap<String, Double[]> gzXXclone = (LinkedHashMap) gzXX.clone();
//        ArrayList<String> paixu = new ArrayList();
//        //按照第一个已选信息排序
//        boolean flag = true;
//        while (flag) {
//            flag = false;
//            Set<String> s = gzXXclone.keySet();
//            double maxValue = -9999999;
//            double minValue = 9999999;
//            for (String r_animalG : s) {
//                if(gzXX.get(r_animalG)[1] == null){
//                    Double[] d = new Double[selectedXX.size()];
//                    for(int i=1;i<d.length;i++){
//                        d[i] = 0.0;
//                    }
//                    gzXX.replace(r_animalG, d);
//                    JOptionPane.showMessageDialog(null, r_animalG + "缺少EBV信息，请更新EBV", "提示", JOptionPane.INFORMATION_MESSAGE);
//                }
//                if (selectedXX_DESC.get(0) == true && gzXX.get(r_animalG)[1] > maxValue) {//以降序排列
////                    System.out.println("降序排列");
//                    maxValue = gzXX.get(r_animalG)[1];
//                    maxGz = r_animalG;
//                    flag = true;
//                }
//                /*
//                if (selectedXX_DESC.get(i) == true && gzXX.get(r_animal)[i+1]==maxValue){//以降序排列，并且第一个参数相等
//                    //记录重复的
//                    needSecond.add(i);
//                }*/
//
//                if (selectedXX_DESC.get(0) == false && gzXX.get(r_animalG)[1] < minValue) {//以升序排列
////                    System.out.println("升序排列");
//                    minValue = gzXX.get(r_animalG)[1];
//                    maxGz = r_animalG;
//                    flag = true;
//                }
//            }
//            if (flag == true) {
//                s.remove(maxGz);
//                paixu.add(maxGz);
//            }
//        }
//
//        System.out.println("paixu.size" + paixu.size());
//        for (int i = 0; i < paixu.size(); i++) {
//            System.out.print("+++" + paixu.get(i) + "+++");
//            System.out.println("\t" + Arrays.toString(gzXX.get(paixu.get(i))));
//        }
//
//        //按照第二个已选信息
//        flag = true;
//        while (flag) {
//            if (selectedXX.size() < 2) {
//                break;
//            }
//            flag = false;
//            for (int i = 1; i < paixu.size(); i++) {
//                if (selectedXX_DESC.get(1) == true) {//以降序排序
//                    if (gzXX.get(paixu.get(i - 1))[2].equals(gzXX.get(paixu.get(i))[2]) //如果前一头猪的第一个性状值等于当前猪的第一个性状值
//                            && gzXX.get(paixu.get(i - 1))[2] < gzXX.get(paixu.get(i))[2]) { //前一头猪的第二个性状小于当前猪的第二个性状
//                        //交换两头猪的位置
//                        paixu.add(i - 1, paixu.get(i));
//                        paixu.remove(i + 1);
//                        flag = true;
//                    }
//                } else//以升序排序
//                if (gzXX.get(paixu.get(i - 1))[2].equals(gzXX.get(paixu.get(i))[2]) //如果前一头猪的第一个性状值等于当前猪的第一个性状值
//                        && gzXX.get(paixu.get(i - 1))[2] > gzXX.get(paixu.get(i))[2]) { //前一头猪的第二个性状大于当前猪的第二个性状
//                    //交换两头猪的位置
//                    paixu.add(i - 1, paixu.get(i));
//                    paixu.remove(i + 1);
//                    flag = true;
//                }
//            }
//        }
//
//        //输出最终linkedHashMap
//        LinkedHashMap<String, Double[]> zzXX = new LinkedHashMap();//猪只信息
//        for (int i = 0; i < paixu.size() && i < 10; i++) {
//            zzXX.put(paixu.get(i), gzXX.get(paixu.get(i)));
//        }
//
//        /*
//        //提取母猪信息
//        String MzID;
//        Double[] MzXX = new Double[selectedXX.size()+1];
//        Set<String> M = mzXX.keySet();
//        for(String r_animalM : M){
//            MzID = r_animalM;
//            MzXX = mzXX.get(r_animalM);
//        }
//        System.out.println("母猪信息*****：" + Arrays.toString(MzXX));
//
//        System.out.println("paixu:" + paixu.toString());
//         */
//        //计算平均值
////        s = gzXX.keySet();
////        Iterator<String> si = s.iterator();
////        while(si.hasNext() && zzXX.size()<10){
////            String GzID = si.next();
////            Double[] GzXX = gzXX.get(GzID);
////            for(int i=1;i<=selectedXX.size();i++){
////                GzXX[i] = (MzXX[i] + GzXX[i])/2;
////                zzXX.put(GzID, GzXX);
////            }
////        }
//        /*       for(int i=0;i<paixu.size() && i<10;i++){
//            String GzID = paixu.get(i);
//            Double[] GzXX = gzXX.get(GzID);
//            for(int j=1;j<=selectedXX.size();j++){
//                GzXX[j] = (MzXX[j] + GzXX[j])/2;
//                zzXX.put(GzID, GzXX);
//            }
//        }*/
//        return zzXX;
//    }
//
//    private void saveToExcel(ArrayList<LinkedHashMap<String, Double[]>> ZZXX) throws WriteException {
////        FileDialog saveDia = new FileDialog(this.loadDia, "选种指导文件保存", FileDialog.SAVE);
//        JFileChooser chooser = new JFileChooser();
//        FileNameExtensionFilter filter = new FileNameExtensionFilter(
//                "Excel 97-2003 工作簿(.xls)", "xls");
//        chooser.setFileFilter(filter);
//        int returnVal = chooser.showSaveDialog(this);
//        if (returnVal != JFileChooser.APPROVE_OPTION) {
//            JOptionPane.showMessageDialog(null, "用户取消", "提示", JOptionPane.INFORMATION_MESSAGE);
//            return;
//        }
//
////        String[] t = updateTiele();
////        int col_length = t.length;//列数
//        WritableWorkbook wwb = null;
//        File f = null;
//        try {
//            f = chooser.getSelectedFile();
//            if (!f.getName().endsWith(".xls")) {
//                String temp = f.getPath() + ".xls";
//                f = new File(temp);
//            }
//
//            f.createNewFile();
//            //首先要使用Workbook类的工厂方法创建一个可写入的工作薄(Workbook)对象
//            wwb = Workbook.createWorkbook(f);
//        } catch (IOException e) {
////            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.WARNING_MESSAGE);
//        }
//        if (wwb == null) {
//            JOptionPane.showMessageDialog(null, "wwb == null", "错误", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//
//        //创建一个可写入的工作表
//        //Workbook的createSheet方法有两个参数，第一个是工作表的名称，第二个是工作表在工作薄中的位置
//        WritableSheet ws = wwb.createSheet("选配计划", 0);
//        ws.setColumnView(0, 3);//设置列宽
//        for (int i = 1; i <= 11; i++) {
//            ws.setColumnView(i, 12);
//        }
//        ws.setRowView(0, 700, false);
//        ws.setRowView(4, 150, false);
//        ws.setPageSetup(PageOrientation.LANDSCAPE.LANDSCAPE);// 設置打印橫向
//        //设置页边距(0.1d=0.26cm)
//        ws.getSettings().setBottomMargin(0.7d);
//        ws.getSettings().setTopMargin(0.7d);
//        ws.getSettings().setLeftMargin(0.4d);
//        ws.getSettings().setRightMargin(0.4d);
//        ws.getSettings().setHorizontalCentre(true);//设置水平居中
//        ws.getSettings().setVerticalCentre(true);//设置垂直居中
//        ws.setFooter("", "&P", "Ubreed优育");
//
//        WritableFont font1 = new WritableFont(WritableFont.ARIAL, 9);
//        WritableCellFormat cellFormat1 = new WritableCellFormat(font1);
//        //设置背景颜色;
//        cellFormat1.setBackground(Colour.GREY_25_PERCENT);
//        //设置边框;
//        cellFormat1.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
//        cellFormat1.setWrap(true);
//        //设置文字居中对齐方式;
//        cellFormat1.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        cellFormat1.setVerticalAlignment(VerticalAlignment.CENTRE);
//
//        WritableCellFormat cellFormat2 = new WritableCellFormat(font1);
//        //设置背景颜色;
////        cellFormat2.setBackground(Colour.BLUE_GREY);
//        //设置边框;
//        cellFormat2.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
//        cellFormat2.setWrap(true);
//        //设置文字居中对齐方式;
//        cellFormat2.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        cellFormat2.setVerticalAlignment(VerticalAlignment.CENTRE);
//
//        WritableFont font2 = new WritableFont(WritableFont.ARIAL, 9, WritableFont.BOLD);
//        WritableCellFormat cellFormat3 = new WritableCellFormat(font2);
//        //设置背景颜色;
//        cellFormat3.setBackground(Colour.GREY_25_PERCENT);
//        //设置边框;
//        cellFormat3.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
//        cellFormat3.setWrap(true);
//        //设置文字居中对齐方式;
//        cellFormat3.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        cellFormat3.setVerticalAlignment(VerticalAlignment.CENTRE);
//
//        WritableCellFormat cellFormat4 = new WritableCellFormat(font2);
//        //设置背景颜色;
////        cellFormat2.setBackground(Colour.BLUE_GREY);
//        //设置边框;
//        cellFormat4.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
//        cellFormat4.setWrap(true);
//        //设置文字居中对齐方式;
//        cellFormat4.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        cellFormat4.setVerticalAlignment(VerticalAlignment.CENTRE);
//
//        System.out.println("ZZXXsize" + ZZXX.size());
//
//        WritableCellFormat use1, use2;
//        for (int i = 0; i < ZZXX.size(); i += 2) {
//            if ((i + 2) / 2 % 2 == 1) {
//                use1 = cellFormat1;
//                use2 = cellFormat3;
//            } else {
//                use1 = cellFormat2;
//                use2 = cellFormat4;
//            }//设置对应行的单元格格式
//
//            Label labelNum = new Label(0, i + 6, (i + 2) / 2 + "", use1);
//            ws.addCell(labelNum);
//            ws.mergeCells(0, i + 6, 0, i + 7);//写入编号
//
//            LinkedHashMap<String, Double[]> MZXX = ZZXX.get(i);
//            LinkedHashMap<String, Double[]> GZXX = ZZXX.get(i + 1);
//            Set<String> sMZ = MZXX.keySet();
//            Set<String> sGZ = GZXX.keySet();
//            for (String iMZ : sMZ) {
//                Label labelMid = new Label(1, i + 6, iMZ.substring(iMZ.length() - 8), use2);
//                Label labelM = new Label(1, i + 7, shortEBV(MZXX.get(iMZ)), use2);
//                ws.addCell(labelMid);
//                ws.addCell(labelM);
//            }//写入母猪编号和母猪信息
//
//            int j = 2;
//            for (String iGZ : sGZ) {
//                Label labelG = new Label(j, i + 6, iGZ.substring(iGZ.length() - 8) + " " + String.format("%.6f", GZXX.get(iGZ)[0]), use1);
//                Label labelE = new Label(j, i + 7, shortEBV(GZXX.get(iGZ)), use1);
//                ws.addCell(labelG);
//                ws.addCell(labelE);
//                j++;
//            }//写入公猪编号和公猪信息
////            if(j<11) {
//            while (j < 12) {
//                Label labelG = new Label(j, i + 6, "", use1);
//                Label labelE = new Label(j, i + 7, "", use1);
//                ws.addCell(labelG);
//                ws.addCell(labelE);
//                j++;
//            }//补全
////            }
//
//            /*
//            j=1;
//            for(String iPJ : sPJ){
////                Label labelG = new Label(j, i, iGZ);
//                Label labelE = new Label(j, i+2, Arrays.toString(PJXX.get(iPJ)));
////                ws.addCell(labelG);
//                ws.addCell(labelE);
//                j++;
//            }//写入平均值
//             */
//        }
//
//        /**
//         * *************写入标题头***************
//         */
//        WritableFont head = new WritableFont(WritableFont.createFont("微软雅黑"), 16);
//        WritableCellFormat headFormat = new WritableCellFormat(head);
//        //设置背景颜色;
////        cellFormat1.setBackground(Colour.GREY_25_PERCENT);
//        //设置边框;
////        cellFormat1.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
////        cellFormat1.setWrap(true);
//        //设置文字居中对齐方式;
//        headFormat.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        headFormat.setVerticalAlignment(VerticalAlignment.TOP);
//        Label titleH = new Label(0, 0, "选配计划", headFormat);
//        ws.addCell(titleH);
//        ws.mergeCells(0, 0, 11, 0);
//
//        /**
//         * ***************写入参数信息****************
//         */
//        WritableFont param = new WritableFont(WritableFont.createFont("楷体"), 10);
//        WritableCellFormat paramFormat = new WritableCellFormat(param);
//        //设置背景颜色;
////        cellFormat1.setBackground(Colour.GREY_25_PERCENT);
//        //设置边框;
////        cellFormat1.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
////        paramFormat.setWrap(true);
//        //设置文字居中对齐方式;
////        paramFormat.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
////        cellFormat1.setVerticalAlignment(VerticalAlignment.CENTRE);
//        List<FarmName> farmName;
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            FarmNameMapper mapper = sqlSession.getMapper(FarmNameMapper.class);
//            farmName = mapper.selectAll();
//        }
//        Label param1 = new Label(0, 1, "近交系数阈值：" + jButton5.getText() + jjxsYz, paramFormat);
//        Label param2 = new Label(4, 1, "采精间隔天数：" + cjjgts, paramFormat);
//        Label param3 = new Label(7, 1, "优选选配种猪：10", paramFormat);
//        Label param4 = new Label(9, 1, "      猪  场：" + farmName.get(0).getFarm_name(), paramFormat);
//        Label param5 = new Label(9, 2, "      时  间：" + NowTime(), paramFormat);
//        Label param6 = new Label(9, 3, "      制表人：" + main2app.getNowEmployee().getUser_name(), paramFormat);
//        ws.addCell(param1);
//        ws.addCell(param2);
//        ws.addCell(param3);
//        ws.addCell(param4);
//        ws.addCell(param5);
//        ws.addCell(param6);
//
//        String[] xx = new String[6];
//        jTable2.getRowCount();
//        for (int i = 0; i < xx.length; i++) {
//            if (i < jTable2.getRowCount()) {
//                xx[i] = jTable2.getValueAt(i, 0) + (selectedXX_DESC.get(i) ? "↓" : "↑");
//            } else {
//                xx[i] = "";
//            }
//        }
//
//        Label param01 = new Label(0, 2, "信息1：" + xx[0], paramFormat);
//        Label param02 = new Label(4, 2, "信息2：" + xx[1], paramFormat);
//        Label param03 = new Label(7, 2, "信息3：" + xx[2], paramFormat);
//        Label param04 = new Label(0, 3, "信息4：" + xx[3], paramFormat);
//        Label param05 = new Label(4, 3, "信息5：" + xx[4], paramFormat);
//        Label param06 = new Label(7, 3, "信息6：" + xx[5], paramFormat);
//        ws.addCell(param01);
//        ws.addCell(param02);
//        ws.addCell(param03);
//        ws.addCell(param04);
//        ws.addCell(param05);
//        ws.addCell(param06);
//
//        /**
//         * ************写入标题行*************
//         */
//        WritableFont titleLine = new WritableFont(WritableFont.TIMES, 9, WritableFont.BOLD);
//        WritableCellFormat titleFormat = new WritableCellFormat(titleLine);
//        //设置背景颜色;
////        cellFormat1.setBackground(Colour.GREY_25_PERCENT);
//        //设置边框;
//        titleFormat.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
////        cellFormat1.setWrap(true);
//        //设置文字居中对齐方式;
//        titleFormat.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        titleFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
//        Label t0 = new Label(0, 5, "序号", titleFormat);
//        Label t1 = new Label(1, 5, "母猪编号", titleFormat);
//        Label t2 = new Label(2, 5, "选配公猪1", titleFormat);
//        Label t3 = new Label(3, 5, "选配公猪2", titleFormat);
//        Label t4 = new Label(4, 5, "选配公猪3", titleFormat);
//        Label t5 = new Label(5, 5, "选配公猪4", titleFormat);
//        Label t6 = new Label(6, 5, "选配公猪5", titleFormat);
//        Label t7 = new Label(7, 5, "选配公猪6", titleFormat);
//        Label t8 = new Label(8, 5, "选配公猪7", titleFormat);
//        Label t9 = new Label(9, 5, "选配公猪8", titleFormat);
//        Label t10 = new Label(10, 5, "选配公猪9", titleFormat);
//        Label t11 = new Label(11, 5, "选配公猪10", titleFormat);
//        ws.addCell(t0);
//        ws.addCell(t1);
//        ws.addCell(t2);
//        ws.addCell(t3);
//        ws.addCell(t4);
//        ws.addCell(t5);
//        ws.addCell(t6);
//        ws.addCell(t7);
//        ws.addCell(t8);
//        ws.addCell(t9);
//        ws.addCell(t10);
//        ws.addCell(t11);
//
//        //这里需要注意的是，在Excel中，第一个参数表示列，第二个表示行
////                    Label labelC = new Label(j, i + 1, str);
////                    //将生成的单元格添加到工作表中
////                    ws.addCell(labelC);
//        try {
//            //从内存中写入文件中
//            wwb.write();
//            //关闭资源，释放内存
//            wwb.close();
//        } catch (IOException | WriteException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.WARNING_MESSAGE);
//        }
////        JOptionPane.showMessageDialog(null, "文件写入完成！", "完成", JOptionPane.OK_OPTION);
//        int openQ = JOptionPane.showConfirmDialog(this, "文件写入完毕，请问是否打开？", "提示",
//                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//        if (openQ == JOptionPane.YES_OPTION) {
//            try {
//                Desktop.getDesktop().open(f);
//            } catch (IOException | RuntimeException ex) {
//                JOptionPane.showMessageDialog(null, ex.getMessage() + "\n抱歉，文件打开失败，请手动打开", "错误", JOptionPane.WARNING_MESSAGE);
//            }
//        }
//    }
//
//    private void saveToExcel1(ArrayList<LinkedHashMap<String, Double[]>> ZZXX, LinkedHashMap<String, Double[]> allJJXS) throws WriteException {
////        FileDialog saveDia = new FileDialog(this.loadDia, "选种指导文件保存", FileDialog.SAVE);
//        JFileChooser chooser = new JFileChooser();
//        FileNameExtensionFilter filter = new FileNameExtensionFilter(
//                "Excel 97-2003 工作簿(.xls)", "xls");
//        chooser.setFileFilter(filter);
//        int returnVal = chooser.showSaveDialog(this);
//        if (returnVal != JFileChooser.APPROVE_OPTION) {
//            JOptionPane.showMessageDialog(null, "用户取消", "提示", JOptionPane.INFORMATION_MESSAGE);
//            return;
//        }
//
////        String[] t = updateTiele();
////        int col_length = t.length;//列数
//        WritableWorkbook wwb = null;
//        File f = null;
//        try {
//            f = chooser.getSelectedFile();
//            if (!f.getName().endsWith(".xls")) {
//                String temp = f.getPath() + ".xls";
//                f = new File(temp);
//            }
//
//            f.createNewFile();
//            //首先要使用Workbook类的工厂方法创建一个可写入的工作薄(Workbook)对象
//            wwb = Workbook.createWorkbook(f);
//        } catch (IOException e) {
////            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.WARNING_MESSAGE);
//        }
//        if (wwb == null) {
//            JOptionPane.showMessageDialog(null, "wwb == null", "错误", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//
//        //创建一个可写入的工作表
//        //Workbook的createSheet方法有两个参数，第一个是工作表的名称，第二个是工作表在工作薄中的位置
//        WritableSheet ws = wwb.createSheet("选配计划", 0);
//        ws.setColumnView(0, 3);//设置列宽
//        for (int i = 1; i <= 11; i++) {
//            ws.setColumnView(i, 12);
//        }
//        ws.setRowView(0, 700, false);
//        ws.setRowView(4, 150, false);
//        ws.setPageSetup(PageOrientation.LANDSCAPE.LANDSCAPE);// 設置打印橫向
//        //设置页边距(0.1d=0.26cm)
//        ws.getSettings().setBottomMargin(0.7d);
//        ws.getSettings().setTopMargin(0.7d);
//        ws.getSettings().setLeftMargin(0.4d);
//        ws.getSettings().setRightMargin(0.4d);
//        ws.getSettings().setHorizontalCentre(true);//设置水平居中
//        ws.getSettings().setVerticalCentre(true);//设置垂直居中'
//        ws.setFooter("", "&P", "Ubreed优育");
//
//        WritableFont font1 = new WritableFont(WritableFont.ARIAL, 9);
//        WritableCellFormat cellFormat1 = new WritableCellFormat(font1);
//        //设置背景颜色;
//        cellFormat1.setBackground(Colour.GREY_25_PERCENT);
//        //设置边框;
//        cellFormat1.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
//        cellFormat1.setWrap(true);
//        //设置文字居中对齐方式;
//        cellFormat1.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        cellFormat1.setVerticalAlignment(VerticalAlignment.CENTRE);
//
//        WritableCellFormat cellFormat2 = new WritableCellFormat(font1);
//        //设置背景颜色;
////        cellFormat2.setBackground(Colour.BLUE_GREY);
//        //设置边框;
//        cellFormat2.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
//        cellFormat2.setWrap(true);
//        //设置文字居中对齐方式;
//        cellFormat2.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        cellFormat2.setVerticalAlignment(VerticalAlignment.CENTRE);
//
//        WritableFont font2 = new WritableFont(WritableFont.ARIAL, 9, WritableFont.BOLD);
//        WritableCellFormat cellFormat3 = new WritableCellFormat(font2);
//        //设置背景颜色;
//        cellFormat3.setBackground(Colour.GREY_25_PERCENT);
//        //设置边框;
//        cellFormat3.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
//        cellFormat3.setWrap(true);
//        //设置文字居中对齐方式;
//        cellFormat3.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        cellFormat3.setVerticalAlignment(VerticalAlignment.CENTRE);
//
//        WritableCellFormat cellFormat4 = new WritableCellFormat(font2);
//        //设置背景颜色;
////        cellFormat2.setBackground(Colour.BLUE_GREY);
//        //设置边框;
//        cellFormat4.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
//        cellFormat4.setWrap(true);
//        //设置文字居中对齐方式;
//        cellFormat4.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        cellFormat4.setVerticalAlignment(VerticalAlignment.CENTRE);
//
//        WritableFont font3 = new WritableFont(WritableFont.ARIAL, 10);
//        WritableCellFormat cellFormat5 = new WritableCellFormat(font3);
//        //设置背景颜色;
//        cellFormat5.setBackground(Colour.GREY_25_PERCENT);
//        //设置边框;
//        cellFormat5.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
//        cellFormat5.setWrap(true);
//        //设置文字居中对齐方式;
//        cellFormat5.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        cellFormat5.setVerticalAlignment(VerticalAlignment.CENTRE);
//
//        WritableCellFormat cellFormat6 = new WritableCellFormat(font3);
//        //设置边框;
//        cellFormat6.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
//        cellFormat6.setWrap(true);
//        //设置文字居中对齐方式;
//        cellFormat6.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        cellFormat6.setVerticalAlignment(VerticalAlignment.CENTRE);
//
//        System.out.println("ZZXXsize" + ZZXX.size());
//
//        WritableCellFormat use1, use2, use3;
//        use2 = cellFormat4;
//
////        int j=2;
//        LinkedHashMap<String, Double[]> GZXX = ZZXX.get(0);
//        System.out.println("GZXX.length:" + GZXX.size());
//        for (int i = 0; i < r_animalsG.size(); i++) {
////            if((i+2)/2%2 == 1){
////                use1 = cellFormat1;
////                use2 = cellFormat3;
////            }else{
////                use1 = cellFormat2;
////                use2 = cellFormat4;
////            }//设置对应行的单元格格式
////            use2 = cellFormat4;
//            Label labelG = new Label(i + 2, 6, r_animalsG.get(i).substring(r_animalsG.get(i).length() - 8), use2);
//            Label labelE = new Label(i + 2, 7, shortEBV(GZXX.get(r_animalsG.get(i))), use2);
//            ws.addCell(labelG);
//            ws.addCell(labelE);
////                j++;
//        }
//        int iG = r_animalsG.size();
//        while (iG < 10) {
//            Label labelG = new Label(iG + 2, 6, "", use2);
//            Label labelE = new Label(iG + 2, 7, "", use2);
//            ws.addCell(labelG);
//            ws.addCell(labelE);
//            iG++;
//        }//补全
//
//        LinkedHashMap<String, Double[]> MZXX = ZZXX.get(1);
////        Set<String> sMZ = MZXX.keySet();
////        Set MZID = MZXX.keySet();
//        for (int i = 0; i < MZXX.size() * 2; i += 2) {
//            if ((i + 2) / 2 % 2 == 1) {
//                use1 = cellFormat1;
//                use2 = cellFormat3;
//                use3 = cellFormat5;
//            } else {
//                use1 = cellFormat2;
//                use2 = cellFormat4;
//                use3 = cellFormat6;
//            }//设置对应行的单元格格式
//
//            Label labelNum = new Label(0, i + 8, (i + 2) / 2 + "", use1);
//            ws.addCell(labelNum);
//            ws.mergeCells(0, i + 8, 0, i + 9);//写入编号
//
////            LinkedHashMap<String,Double[]> GZXX = ZZXX.get(i+1);
////            Set<String> sGZ = GZXX.keySet();
////            for(String iMZ : sMZ){
//            Label labelMid = new Label(1, i + 8, r_animalsM.get(i / 2).substring(r_animalsM.get(i / 2).length() - 8), use2);
//            Label labelM = new Label(1, i + 9, shortEBV(MZXX.get(r_animalsM.get(i / 2))), use2);
//            ws.addCell(labelMid);
//            ws.addCell(labelM);
//            //写入母猪编号和母猪信息
//
//            int j = 2;
//            Double[] d = allJJXS.get(r_animalsM.get(i / 2));
//            for (double jjxs : d) {
//                Label labelG = new Label(j, i + 8, shortJJXS(jjxs), use3);
//                ws.addCell(labelG);
//                ws.mergeCells(j, i + 8, j, i + 9);
//                j++;
//            }//写入公猪编号和公猪信息
//            while (j < 12) {
//                Label labelG = new Label(j, i + 8, "", use3);
//                ws.addCell(labelG);
//                ws.mergeCells(j, i + 8, j, i + 9);
//                j++;
//            }//补全
//
//        }
//
//        //写入页脚注释内容
//        WritableFont font4 = new WritableFont(WritableFont.ARIAL, 6, WritableFont.BOLD);
//        WritableCellFormat zhuShiWC = new WritableCellFormat(font4);
//        //设置垂直居中;
//        zhuShiWC.setVerticalAlignment(VerticalAlignment.CENTRE);
//        Label zhuShi1 = new Label(1, MZXX.size() * 2 + 8, "近交系数(F)", zhuShiWC);
//        Label zhuShi2 = new Label(2, MZXX.size() * 2 + 8, "F >= 0.0625 ★★★★★", zhuShiWC);
//        Label zhuShi3 = new Label(4, MZXX.size() * 2 + 8, "0.03125 <= F < 0.0625 ★★★★", zhuShiWC);
//        Label zhuShi4 = new Label(6, MZXX.size() * 2 + 8, "0.015625 <= F < 0.03125 ★★★", zhuShiWC);
//        Label zhuShi5 = new Label(8, MZXX.size() * 2 + 8, "0.0078125 <= F < 0.015625 ★★", zhuShiWC);
//        Label zhuShi6 = new Label(10, MZXX.size() * 2 + 8, "0.00390625 <= F < 0.0078125 ★", zhuShiWC);
//        ws.addCell(zhuShi1);
//        ws.addCell(zhuShi2);
//        ws.addCell(zhuShi3);
//        ws.addCell(zhuShi4);
//        ws.addCell(zhuShi5);
//        ws.addCell(zhuShi6);
//        if (jjxsYz < 0.00390625) {
//            Label zhuShi7 = new Label(1, MZXX.size() * 2 + 9, "当"+ BigDecimal.valueOf(jjxsYz) +" < F < 0.00390625 显示“警告”   F <= "+ BigDecimal.valueOf(jjxsYz) +"为优育", zhuShiWC);
//            ws.addCell(zhuShi7);
//        }else{
//            Label zhuShi7 = new Label(1, MZXX.size() * 2 + 9, "F <= 0.00390625为优育", zhuShiWC);
//            ws.addCell(zhuShi7);
//        }
//
//        /**
//         * *************写入标题头***************
//         */
//        WritableFont head = new WritableFont(WritableFont.createFont("微软雅黑"), 16);
//        WritableCellFormat headFormat = new WritableCellFormat(head);
//        //设置背景颜色;
////        cellFormat1.setBackground(Colour.GREY_25_PERCENT);
//        //设置边框;
////        cellFormat1.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
////        cellFormat1.setWrap(true);
//        //设置文字居中对齐方式;
//        headFormat.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        headFormat.setVerticalAlignment(VerticalAlignment.TOP);
//        Label titleH = new Label(0, 0, "选配计划", headFormat);
//        ws.addCell(titleH);
//        ws.mergeCells(0, 0, 11, 0);
//
//        /**
//         * ***************写入参数信息****************
//         */
//        WritableFont param = new WritableFont(WritableFont.createFont("楷体"), 10);
//        WritableCellFormat paramFormat = new WritableCellFormat(param);
//        //设置背景颜色;
////        cellFormat1.setBackground(Colour.GREY_25_PERCENT);
//        //设置边框;
////        cellFormat1.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
////        paramFormat.setWrap(true);
//        //设置文字居中对齐方式;
////        paramFormat.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
////        cellFormat1.setVerticalAlignment(VerticalAlignment.CENTRE);
//        List<FarmName> farmName;
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            FarmNameMapper mapper = sqlSession.getMapper(FarmNameMapper.class);
//            farmName = mapper.selectAll();
//        }
//        Label param1 = new Label(0, 1, "近交系数阈值：" + BigDecimal.valueOf(jjxsYz), paramFormat);
//        Label param2 = new Label(4, 1, "采精间隔天数：" + cjjgts, paramFormat);
//        Label param3 = new Label(7, 1, "优选选配种猪：10", paramFormat);
//        Label param4 = new Label(9, 1, "      猪  场：" + farmName.get(0).getFarm_name(), paramFormat);
//        Label param5 = new Label(9, 2, "      时  间：" + NowTime(), paramFormat);
//        Label param6 = new Label(9, 3, "      制表人：" + main2app.getNowEmployee().getUser_name(), paramFormat);
//        ws.addCell(param1);
//        ws.addCell(param2);
//        ws.addCell(param3);
//        ws.addCell(param4);
//        ws.addCell(param5);
//        ws.addCell(param6);
//
//        String[] xx = new String[6];
//        jTable2.getRowCount();
//        for (int i = 0; i < xx.length; i++) {
//            if (i < jTable2.getRowCount()) {
//                xx[i] = jTable2.getValueAt(i, 0) + (selectedXX_DESC.get(i) ? "↓" : "↑");
//            } else {
//                xx[i] = "";
//            }
//        }
//
//        Label param01 = new Label(0, 2, "信息1：" + xx[0], paramFormat);
//        Label param02 = new Label(4, 2, "信息2：" + xx[1], paramFormat);
//        Label param03 = new Label(7, 2, "信息3：" + xx[2], paramFormat);
//        Label param04 = new Label(0, 3, "信息4：" + xx[3], paramFormat);
//        Label param05 = new Label(4, 3, "信息5：" + xx[4], paramFormat);
//        Label param06 = new Label(7, 3, "信息6：" + xx[5], paramFormat);
//        ws.addCell(param01);
//        ws.addCell(param02);
//        ws.addCell(param03);
//        ws.addCell(param04);
//        ws.addCell(param05);
//        ws.addCell(param06);
//
//        /**
//         * ************写入标题行*************
//         */
//        WritableFont titleLine = new WritableFont(WritableFont.TIMES, 9, WritableFont.BOLD);
//        WritableCellFormat titleFormat = new WritableCellFormat(titleLine);
//        //设置背景颜色;
////        cellFormat1.setBackground(Colour.GREY_25_PERCENT);
//        //设置边框;
//        titleFormat.setBorder(Border.ALL, BorderLineStyle.THIN);
//        //设置自动换行;
////        cellFormat1.setWrap(true);
//        //设置文字居中对齐方式;
//        titleFormat.setAlignment(Alignment.CENTRE);
//        //设置垂直居中;
//        titleFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
//        Label t0 = new Label(0, 5, "序号", titleFormat);
//        Label t1 = new Label(1, 5, "选配母猪", titleFormat);
//        Label t2 = new Label(2, 5, "选配公猪1", titleFormat);
//        Label t3 = new Label(3, 5, "选配公猪2", titleFormat);
//        Label t4 = new Label(4, 5, "选配公猪3", titleFormat);
//        Label t5 = new Label(5, 5, "选配公猪4", titleFormat);
//        Label t6 = new Label(6, 5, "选配公猪5", titleFormat);
//        Label t7 = new Label(7, 5, "选配公猪6", titleFormat);
//        Label t8 = new Label(8, 5, "选配公猪7", titleFormat);
//        Label t9 = new Label(9, 5, "选配公猪8", titleFormat);
//        Label t10 = new Label(10, 5, "选配公猪9", titleFormat);
//        Label t11 = new Label(11, 5, "选配公猪10", titleFormat);
//        ws.addCell(t0);
//        ws.addCell(t1);
//        ws.addCell(t2);
//        ws.addCell(t3);
//        ws.addCell(t4);
//        ws.addCell(t5);
//        ws.addCell(t6);
//        ws.addCell(t7);
//        ws.addCell(t8);
//        ws.addCell(t9);
//        ws.addCell(t10);
//        ws.addCell(t11);
//        ws.mergeCells(0, 5, 0, 7);
//        ws.mergeCells(1, 5, 1, 7);
//
//        //这里需要注意的是，在Excel中，第一个参数表示列，第二个表示行
////                    Label labelC = new Label(j, i + 1, str);
////                    //将生成的单元格添加到工作表中
////                    ws.addCell(labelC);
//        try {
//            //从内存中写入文件中
//            wwb.write();
//            //关闭资源，释放内存
//            wwb.close();
//        } catch (IOException | WriteException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "错误", JOptionPane.WARNING_MESSAGE);
//        }
////        JOptionPane.showMessageDialog(null, "文件写入完成！", "完成", JOptionPane.OK_OPTION);
//        int openQ = JOptionPane.showConfirmDialog(this, "文件写入完毕，请问是否打开？", "提示",
//                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//        if (openQ == JOptionPane.YES_OPTION) {
//            try {
//                Desktop.getDesktop().open(f);
//            } catch (IOException | RuntimeException ex) {
//                JOptionPane.showMessageDialog(null, ex.getMessage() + "\n抱歉，文件打开失败，请手动打开", "错误", JOptionPane.WARNING_MESSAGE);
//            }
//        }
//    }
//
//    /**
//     * >0.5	***** >0.25	***** >0.125	***** >=0.0625	***** >=0.03125	****
//     * >=0.015625	*** >=0.0078125	** >=0.00390625	* <0.00390625输出值6位小数	不输出
//     * 如果近交系数阈值 < 0.00390625	近交系数阈值 < 近交系数 < 0.00390625	警告
//     * 如果近交系数阈值 > 0.00390625	警告和*同时输出
//     *
//     * @param d
//     * @return
//     */
//    public String shortJJXS(double d) {
//
//        String s = "";
//        if (d >= 0.0625) {
//            s += "★★★★★";
//        } else if (d >= 0.03125) {
//            s += "★★★★";
//        } else if (d >= 0.015625) {
//            s += "★★★";
//        } else if (d >= 0.0078125) {
//            s += "★★";
//        } else if (d >= 0.00390625) {
//            s += "★";
//        }
//
//        if (jjxsYz < d && d < 0.00390625) {
//            s = "警告 ";
//            s += String.format("%.6f", d);
//        }
//        return s;
//    }
//
//    public String shortEBV(Double[] EBV) {
//        String shortEBV = "";
//        System.out.println("EBV.LENGTH" + EBV.length);
//        for (int i = 1; i < EBV.length; i++) {
//            BigDecimal bg;
//            try {
//                bg = new BigDecimal(EBV[i]);
//            } catch (Exception e) {
//                shortEBV = shortEBV + "0 ";
//                continue;
//            }
//            shortEBV = shortEBV + bg.setScale(2, BigDecimal.ROUND_HALF_UP) + " ";
//        }
//        System.out.println("shortEBV " + shortEBV + "length: " + shortEBV.length());
//        shortEBV = shortEBV.substring(0, shortEBV.length() - 1);
//        return shortEBV;
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
//    private void initComponents() {
//
//        buttonGroup1 = new javax.swing.ButtonGroup();
//        jPanel0 = new javax.swing.JPanel();
//        jPanel1 = new javax.swing.JPanel();
//        jScrollPane1 = new javax.swing.JScrollPane();
//        jTable1 = new javax.swing.JTable();
//        jButton3 = new javax.swing.JButton();
//        jButton6 = new javax.swing.JButton();
//        jScrollPane3 = new javax.swing.JScrollPane();
//        jTable2 = new javax.swing.JTable();
//        jScrollPane2 = new javax.swing.JScrollPane();
//        jTable3 = new javax.swing.JTable();
//        jLabel1 = new javax.swing.JLabel();
//        jLabel2 = new javax.swing.JLabel();
//        jLabel3 = new javax.swing.JLabel();
//        jTextField1 = new javax.swing.JTextField();
//        jTextField2 = new javax.swing.JTextField();
//        jButton1 = new javax.swing.JButton();
//        jSeparator1 = new javax.swing.JSeparator();
//        jLabel4 = new javax.swing.JLabel();
//        jButton2 = new javax.swing.JButton();
//        jLabel8 = new javax.swing.JLabel();
//        jButton5 = new javax.swing.JButton();
//        jButton7 = new javax.swing.JButton();
//        jRadioButton1 = new javax.swing.JRadioButton();
//        jRadioButton2 = new javax.swing.JRadioButton();
//        jButton8 = new javax.swing.JButton();
//        jPanel2 = new javax.swing.JPanel();
//        jLabel5 = new javax.swing.JLabel();
//        jScrollPane4 = new javax.swing.JScrollPane();
//        jTable4 = new javax.swing.JTable();
//        jScrollPane5 = new javax.swing.JScrollPane();
//        jTable5 = new javax.swing.JTable();
//        jLabel6 = new javax.swing.JLabel();
//        jLabel7 = new javax.swing.JLabel();
//        jButton4 = new javax.swing.JButton();
//        jToggleButton1 = new javax.swing.JToggleButton();
//
//        setBackground(new java.awt.Color(226, 237, 252));
//        setClosable(true);
//        setIconifiable(true);
//        setResizable(true);
//        setToolTipText("");
//        setPreferredSize(new java.awt.Dimension(1123, 533));
//
//        card = new java.awt.CardLayout();
//        jPanel0.setLayout(new java.awt.CardLayout());
//        jPanel0.setLayout(card);
//
//        jPanel1.setBackground(new java.awt.Color(226, 237, 252));
//        jPanel1.setPreferredSize(new java.awt.Dimension(1123, 533));
//
//        jTable1.setModel(new DefaultTableModel(
//            new Object [][] {
//
//            },
//            new String [] {
//                "序号", "待选信息"
//            }
//        ) {
//            boolean[] canEdit = new boolean [] {
//                false, false
//            };
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//        });
//        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jTable1MouseClicked(evt);
//            }
//            public void mouseReleased(java.awt.event.MouseEvent evt) {
//                jTable1MouseReleased(evt);
//            }
//        });
//        jScrollPane1.setViewportView(jTable1);
//        if (jTable1.getColumnModel().getColumnCount() > 0) {
//            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
//        }
//
//        jButton3.setText("添加>>");
//        jButton3.setEnabled(false);
//        jButton3.setPreferredSize(new java.awt.Dimension(91, 30));
//        jButton3.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton3ActionPerformed(evt);
//            }
//        });
//
//        jButton6.setText("<<移除");
//        jButton6.setEnabled(false);
//        jButton6.setPreferredSize(new java.awt.Dimension(91, 30));
//        jButton6.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton6ActionPerformed(evt);
//            }
//        });
//
//        jTable2.setModel(new DefaultTableModel(
//            new Object [][] {
//
//            },
//            new String [] {
//                "已选信息", "降序"
//            }
//        ) {
//            Class[] types = new Class [] {
//                Object.class, Boolean.class
//            };
//            boolean[] canEdit = new boolean [] {
//                false, true
//            };
//
//            public Class getColumnClass(int columnIndex) {
//                return types [columnIndex];
//            }
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//        });
//        jTable2.getTableHeader().setReorderingAllowed(false);
//        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jTable2MouseClicked(evt);
//            }
//            public void mouseReleased(java.awt.event.MouseEvent evt) {
//                jTable2MouseReleased(evt);
//            }
//        });
//        jScrollPane3.setViewportView(jTable2);
//        if (jTable2.getColumnModel().getColumnCount() > 0) {
//            jTable2.getColumnModel().getColumn(1).setMaxWidth(50);
//        }
//
//        jTable3.setModel(new DefaultTableModel(
//            new Object [][] {
//
//            },
//            new String [] {
//                "母猪编号", "当前状态", "出生日期", "选择"
//            }
//        ) {
//            Class[] types = new Class [] {
//                Object.class, Object.class, Object.class, Boolean.class
//            };
//            boolean[] canEdit = new boolean [] {
//                false, false, false, true
//            };
//
//            public Class getColumnClass(int columnIndex) {
//                return types [columnIndex];
//            }
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//        });
//        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseClicked(java.awt.event.MouseEvent evt) {
//                jTable3MouseClicked(evt);
//            }
//            public void mouseReleased(java.awt.event.MouseEvent evt) {
//                jTable3MouseReleased(evt);
//            }
//        });
//        jScrollPane2.setViewportView(jTable3);
//        if (jTable3.getColumnModel().getColumnCount() > 0) {
//            jTable3.getColumnModel().getColumn(0).setMaxWidth(50);
//            jTable3.getColumnModel().getColumn(2).setPreferredWidth(100);
//            jTable3.getColumnModel().getColumn(2).setMaxWidth(100);
//            jTable3.getColumnModel().getColumn(3).setMaxWidth(50);
//        }
//
//        jLabel1.setFont(new java.awt.Font("宋体", 0, 30)); // NOI18N
//        jLabel1.setText("选育指导");
//
//        jLabel2.setText("近交系数阈值：");
//
//        jLabel3.setText("采精间隔天数：");
//
//        jTextField1.setText("0.001");
//
//        jTextField2.setText("5");
//
//        jButton1.setVisible(false);
//        jButton1.setText("开始计算");
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton1ActionPerformed(evt);
//            }
//        });
//
//        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
//        jSeparator1.setToolTipText("");
//
//        jLabel4.setText("全部");
//
//        jButton2.setText("初选公猪");
//        jButton2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton2ActionPerformed(evt);
//            }
//        });
//
//        jLabel8.setText("在场种猪平均近交系数：XXX");
//
//        jButton5.setFont(new java.awt.Font("宋体", 1, 15)); // NOI18N
//        jButton5.setForeground(new java.awt.Color(77, 0, 210));
//        jButton5.setText(">=");
//        jButton5.setEnabled(false);
//        jButton5.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton5ActionPerformed(evt);
//            }
//        });
//
//        jButton7.setVisible(false);
//        jButton7.setText("开始计算1");
//        jButton7.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton7ActionPerformed(evt);
//            }
//        });
//
//        jRadioButton1.setBackground(new java.awt.Color(226, 237, 252));
//        buttonGroup1.add(jRadioButton1);
//        jRadioButton1.setSelected(true);
//        jRadioButton1.setText("手动选配");
//        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jRadioButton1ActionPerformed(evt);
//            }
//        });
//
//        jRadioButton2.setBackground(new java.awt.Color(226, 237, 252));
//        buttonGroup1.add(jRadioButton2);
//        jRadioButton2.setText("自动选配");
//        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jRadioButton2ActionPerformed(evt);
//            }
//        });
//
//        jButton8.setText("开始计算");
//        jButton8.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton8ActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//        jPanel1.setLayout(jPanel1Layout);
//        jPanel1Layout.setHorizontalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//                .addGap(39, 39, 39)
//                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                    .addGroup(jPanel1Layout.createSequentialGroup()
//                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(32, 32, 32)
//                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addGroup(jPanel1Layout.createSequentialGroup()
//                                .addGap(23, 23, 23)
//                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
//                            .addGroup(jPanel1Layout.createSequentialGroup()
//                                .addGap(71, 71, 71)
//                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                    .addGroup(jPanel1Layout.createSequentialGroup()
//                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                            .addComponent(jLabel3)
//                                            .addComponent(jLabel2))
//                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                            .addGroup(jPanel1Layout.createSequentialGroup()
//                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                                .addComponent(jTextField1))))
//                                    .addComponent(jLabel8)
//                                    .addGroup(jPanel1Layout.createSequentialGroup()
//                                        .addComponent(jButton7)
//                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                                .addGap(75, 75, 75)
//                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                    .addComponent(jButton8)
//                                    .addComponent(jRadioButton1)
//                                    .addComponent(jRadioButton2))))
//                        .addContainerGap(60, Short.MAX_VALUE))
//                    .addGroup(jPanel1Layout.createSequentialGroup()
//                        .addComponent(jButton2)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addComponent(jLabel4)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(jLabel1)
//                        .addGap(540, 540, 540))))
//        );
//        jPanel1Layout.setVerticalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel1Layout.createSequentialGroup()
//                        .addGap(158, 158, 158)
//                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addGap(35, 35, 35)
//                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(jPanel1Layout.createSequentialGroup()
//                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                            .addGroup(jPanel1Layout.createSequentialGroup()
//                                .addGap(38, 38, 38)
//                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                    .addComponent(jLabel4)
//                                    .addComponent(jButton2)))
//                            .addGroup(jPanel1Layout.createSequentialGroup()
//                                .addGap(16, 16, 16)
//                                .addComponent(jLabel1)))
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
//                            .addComponent(jSeparator1)
//                            .addGroup(jPanel1Layout.createSequentialGroup()
//                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                                    .addGroup(jPanel1Layout.createSequentialGroup()
//                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addGap(20, 20, 20)
//                                        .addComponent(jLabel8)
//                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                            .addComponent(jLabel2)
//                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                            .addComponent(jRadioButton1))
//                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                            .addComponent(jLabel3)
//                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                                    .addGroup(jPanel1Layout.createSequentialGroup()
//                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                                        .addComponent(jRadioButton2)))
//                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                    .addGroup(jPanel1Layout.createSequentialGroup()
//                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                            .addComponent(jButton7)
//                                            .addComponent(jButton1)))
//                                    .addGroup(jPanel1Layout.createSequentialGroup()
//                                        .addGap(17, 17, 17)
//                                        .addComponent(jButton8)))))))
//                .addContainerGap(46, Short.MAX_VALUE))
//        );
//
//        jPanel0.add(jPanel1, "card1");
//
//        jPanel2.setBackground(new java.awt.Color(226, 237, 252));
//
//        jLabel5.setFont(new java.awt.Font("宋体", 0, 30)); // NOI18N
//        jLabel5.setText("选育指导");
//
//        jTable4.setModel(new DefaultTableModel(
//            new Object [][] {
//
//            },
//            new String [] {
//                "序号", "公猪编号", "出生日期", "品种", "参配次数", "选择"
//            }
//        ) {
//            Class[] types = new Class [] {
//                Integer.class, Object.class, Object.class, Object.class, Integer.class, Object.class
//            };
//            boolean[] canEdit = new boolean [] {
//                false, false, false, false, false, true
//            };
//
//            public Class getColumnClass(int columnIndex) {
//                return types [columnIndex];
//            }
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//        });
//        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseReleased(java.awt.event.MouseEvent evt) {
//                jTable4MouseReleased(evt);
//            }
//        });
//        jScrollPane4.setViewportView(jTable4);
//        if (jTable4.getColumnModel().getColumnCount() > 0) {
//            jTable4.getColumnModel().getColumn(0).setMaxWidth(40);
//            jTable4.getColumnModel().getColumn(2).setMaxWidth(85);
//            jTable4.getColumnModel().getColumn(4).setMaxWidth(70);
//            jTable4.getColumnModel().getColumn(5).setMaxWidth(40);
//        }
//
//        jTable5.setModel(new DefaultTableModel(
//            new Object [][] {
//
//            },
//            new String [] {
//                "序号", "公猪编号", "出生日期", "品种", "参配次数"
//            }
//        ) {
//            boolean[] canEdit = new boolean [] {
//                false, false, false, false, false
//            };
//
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit [columnIndex];
//            }
//        });
//        jScrollPane5.setViewportView(jTable5);
//        jTable5.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
//        if (jTable5.getColumnModel().getColumnCount() > 0) {
//            jTable5.getColumnModel().getColumn(0).setMaxWidth(40);
//            jTable5.getColumnModel().getColumn(2).setMaxWidth(85);
//            jTable5.getColumnModel().getColumn(4).setMaxWidth(70);
//        }
//
//        jLabel6.setText("全部公猪：");
//
//        jLabel7.setText("已选公猪：");
//
//        jButton4.setText("确认并返回");
//        jButton4.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton4ActionPerformed(evt);
//            }
//        });
//
//        jToggleButton1.setText("全选");
//        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jToggleButton1ActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
//        jPanel2.setLayout(jPanel2Layout);
//        jPanel2Layout.setHorizontalGroup(
//            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addComponent(jLabel5)
//                .addGap(540, 540, 540))
//            .addGroup(jPanel2Layout.createSequentialGroup()
//                .addGap(28, 28, 28)
//                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
//                    .addGroup(jPanel2Layout.createSequentialGroup()
//                        .addComponent(jLabel6)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                        .addComponent(jToggleButton1))
//                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
//                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addComponent(jLabel7)
//                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
//                .addContainerGap(68, Short.MAX_VALUE))
//        );
//        jPanel2Layout.setVerticalGroup(
//            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel2Layout.createSequentialGroup()
//                .addGap(16, 16, 16)
//                .addComponent(jLabel5)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                    .addComponent(jLabel6)
//                    .addComponent(jLabel7)
//                    .addComponent(jToggleButton1))
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel2Layout.createSequentialGroup()
//                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
//                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
//                        .addComponent(jButton4))
//                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
//                .addGap(20, 20, 20))
//        );
//
//        jPanel0.add(jPanel2, "card2");
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addComponent(jPanel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(0, 0, 0))
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addComponent(jPanel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//        );
//
//        pack();
//    }// </editor-fold>//GEN-END:initComponents
//
//    //待选表
//    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
//
//    }//GEN-LAST:event_jTable1MouseClicked
//
//    //添加按钮
//    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//
//        //add已选信息
//        titleheads2.add(titleheads1.get(jTable1.getSelectedRow()));
//        jiangxu2.add(true);
//        titleheads1.remove(jTable1.getSelectedRow());
//
//        //刷新表
//        refreshJTable();
//
//        //刷新按钮
//        jButton3.setEnabled(false);
//        jButton6.setEnabled(false);
//    }//GEN-LAST:event_jButton3ActionPerformed
//
//    //已选表
//    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
//
//        // TODO add your handling code here:
//    }//GEN-LAST:event_jTable2MouseClicked
//
//    //移除已选
//    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
//
//        titleheads1.add(titleheads2.get(jTable2.getSelectedRow()));
//        titleheads2.remove(jTable2.getSelectedRow());
//        jiangxu2.remove(jTable2.getSelectedRow());
//
//        //刷新表
//        refreshJTable();
//
//        //刷新按钮
//        jButton3.setEnabled(false);
//        jButton6.setEnabled(false);
//        // TODO add your handling code here:
//    }//GEN-LAST:event_jButton6ActionPerformed
//
//    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
//        if (titleheads2.size() < 6) {
//            jButton3.setEnabled(true);
//        }
//        // TODO add your handling code here:
//    }//GEN-LAST:event_jTable1MouseReleased
//
//    private void jTable2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseReleased
//        jButton6.setEnabled(true);
//        // TODO add your handling code here:
//    }//GEN-LAST:event_jTable2MouseReleased
//
//    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
//        // TODO add your handling code here:
//    }//GEN-LAST:event_jTable3MouseClicked
//
//    private void jTable3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseReleased
//        // TODO add your handling code here:
//    }//GEN-LAST:event_jTable3MouseReleased
//
//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        // TODO add your handling code here:
////        getJJXS();
//        if (jTable3.getModel().getRowCount() == 0) {
//            JOptionPane.showMessageDialog(null, "已选母猪为空，请先统计后选择母猪", "错误", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        if (jTable2.getModel().getRowCount() == 0) {
//            JOptionPane.showMessageDialog(null, "已选信息为空，请添加信息后再计算", "错误", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        if (!(textIsTrue(jTextField1) || textIsTrue(jTextField2))) {
//            return;
//        }
//        this.jjxsYz = Double.parseDouble(jTextField1.getText());
//        this.cjjgts = Integer.parseInt(jTextField2.getText());
//        getZZQYGX();
//        updateXX();
//
//        //读取已选种母猪编号
//        ArrayList<String> r_animalM = new ArrayList();
//        TableModel table = jTable3.getModel();
//        for (int i = 0; i < table.getRowCount(); i++) {
//            if ((boolean) table.getValueAt(i, 3) == true) {
//                r_animalM.add((String) table.getValueAt(i, 0));
//                System.out.println("===已选母猪编号:" + (String) table.getValueAt(i, 0));
//            }
//        }
//
//        ArrayList<LinkedHashMap<String, Double[]>> ZZXX = new ArrayList();//储存所有猪的6个信息
//
//        for (String mzid : r_animalM) {
////            HashMap<String, Double> mzjjxs = new HashMap();
////            mzjjxs.put(mzid, 1.0);
//            LinkedHashMap<String, Double[]> MZXX = new LinkedHashMap();
//            Double[] nullXX = new Double[selectedXX.size() + 1];
//            MZXX.put(mzid, nullXX);//将一只母猪存到LinkedHashMap里
//            MZXX = selectSix(MZXX);//然后从数据库中select这只母猪的6个信息
//            ZZXX.add(MZXX);        //最后将这只母猪的LinkedHashMap存到ArrayList里
//            System.out.println("mzid" + mzid);
//
//            LinkedHashMap<String, Double[]> canBreedGZ = simBreed(mzid);//根据当前母猪的编号，与所有公猪模拟，筛选出仔猪符合近交系数阈值的公猪
//            System.out.println("sim-size=" + canBreedGZ.size());
//            canBreedGZ = selectCJJG(canBreedGZ);                        //筛选公猪采精间隔
//            System.out.println("CJJG-size=" + canBreedGZ.size());
//            canBreedGZ = selectSix(canBreedGZ);                         //获取所有符合条件公猪的6个EBV信息
//            System.out.println("Six-size=" + canBreedGZ.size());
//            canBreedGZ = sortGZXX(canBreedGZ);
//            System.out.println("sort-size=" + canBreedGZ.size());
//
//            /*
//            HashMap<String, Double> gzjjxs = selectJJXSYZ(mzid);
//            gzjjxs = selectCJJG(gzjjxs);
//            HashMap<String, Double[]> GZXX = selectSix(gzjjxs);*/
//            ZZXX.add(canBreedGZ);
//
//        }
//        try {
//            saveToExcel(ZZXX);
//        } catch (WriteException ex) {
//            Logger.getLogger(Xyzd.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }//GEN-LAST:event_jButton1ActionPerformed
//
//    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        // TODO add your handling code here:
//        main2app.closeSearch(false);
//        if (jTable5.getModel() != null && jTable5.getModel().getRowCount() != 0) {
//            card.show(jPanel0, "card2");
//            return;
//        }
//        //初始化公猪列表
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            SearchMapper searchMapper = sqlSession.getMapper(SearchMapper.class);
//            r_animalsG = searchMapper.XyzdGzSelect(minusDate(NowTime(), 1460), NowTime());
//            sqlSession.close();
//        }
//
//        //select公猪信息
//        try (SqlSession sqlSession = MybatisUtil.getSqlSession()) {
//            XyzdMapper xyzdMapper = sqlSession.getMapper(XyzdMapper.class);
//            BreedingMapper breedingMapper = sqlSession.getMapper(BreedingMapper.class);
//            Object[][] tableModel = new Object[r_animalsG.size()][6];
//            for (int i = 0; i < r_animalsG.size(); i++) {
//                HashMap<String, String> selebithG = xyzdMapper.selectXyzdGzXx(r_animalsG.get(i));
//                tableModel[i][0] = i + 1;
//                tableModel[i][1] = r_animalsG.get(i);
//                tableModel[i][2] = selebithG.get("r_fdate");
//                tableModel[i][3] = lineidIdtoNameSmap.get(selebithG.get("r_lineid"));
//                tableModel[i][4] = breedingMapper.selectCountByid(r_animalsG.get(i));
//                tableModel[i][5] = false;
//            }
//            TableModel table = new DefaultTableModel(tableModel, new String[]{
//                "序号", "公猪编号", "出生日期", "品种", "参配次数", "选择"
//            }) {
//
//                Class[] types = new Class[]{
//                    Integer.class, Object.class, Object.class, Object.class, Integer.class, Boolean.class
//                };
//                boolean[] canEdit = new boolean[]{
//                    false, false, false, false, false, true
//                };
//
//                @Override
//                public Class getColumnClass(int columnIndex) {
//                    return types[columnIndex];
//                }
//
//                @Override
//                public boolean isCellEditable(int rowIndex, int columnIndex) {
//                    return canEdit[columnIndex];
//                }
//            };
//
//            RowSorter<TableModel> sorter = new TableRowSorter<>(table);
//            sorter.toggleSortOrder(4);
//            sorter.toggleSortOrder(4);
//            jTable4.setModel(table);
//            jTable4.setRowSorter(sorter);
//
//            if (jTable4.getColumnModel().getColumnCount() > 0) {
//                jTable4.getColumnModel().getColumn(0).setMaxWidth(43);
//                jTable4.getColumnModel().getColumn(2).setPreferredWidth(85);
//                jTable4.getColumnModel().getColumn(2).setMaxWidth(85);
//                jTable4.getColumnModel().getColumn(4).setPreferredWidth(82);
//                jTable4.getColumnModel().getColumn(4).setMaxWidth(82);
//                jTable4.getColumnModel().getColumn(5).setMaxWidth(43);
//            }
//        }
//
//        card.show(jPanel0, "card2");
//    }//GEN-LAST:event_jButton2ActionPerformed
//
//    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        // TODO add your handling code here:
//        main2app.closeSearch(true);
//        TableModel table5 = jTable5.getModel();
//        if (table5.getRowCount() > 0) {
//            r_animalsG.clear();
//        }
//        for (int i = 0; i < table5.getRowCount(); i++) {
//            r_animalsG.add((String) table5.getValueAt(i, 1));
//        }
//        if (jTable5.getModel().getRowCount() > 0) {
//            jLabel4.setText("已选" + r_animalsG.size() + "只");
//            if (jTable5.getModel().getRowCount() == jTable4.getModel().getRowCount()) {
//                jLabel4.setText("全部");
//            }
//        } else {
//            jLabel4.setText("全部");
//        }
//        card.show(jPanel0, "card1");
//    }//GEN-LAST:event_jButton4ActionPerformed
//
//    private void jTable4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseReleased
//        // TODO add your handling code here:
//        ArrayList<Object[]> ar = new ArrayList();
//        TableModel tableModel4 = jTable4.getModel();
//        for (int i = 0; i < tableModel4.getRowCount(); i++) {
//            if ((boolean) tableModel4.getValueAt(i, 5)) {
//                Object[] row = new Object[5];
//                row[0] = tableModel4.getValueAt(i, 0);
//                row[1] = tableModel4.getValueAt(i, 1);
//                row[2] = tableModel4.getValueAt(i, 2);
//                row[3] = tableModel4.getValueAt(i, 3);
//                row[4] = tableModel4.getValueAt(i, 4);
//                ar.add(row);
//            }
//        }
//        Object[][] table = new Object[ar.size()][5];
//        for (int i = 0; i < ar.size(); i++) {
//            table[i] = ar.get(i);
//        }
//        for (int i = 0; i < table.length; i++) {
//            for (int j = 0; j < table[0].length; j++) {
//                System.out.print(table[i][j] + "\t");
//            }
//            System.out.println("");
//        }
//        TableModel tableModel = new DefaultTableModel(table, new String[]{
//            "序号", "公猪编号", "出生日期", "品种", "参配次数"
//        }) {
//            Class[] types = new Class[]{
//                Object.class, Object.class, Object.class, Object.class, Object.class
//            };
//            boolean[] canEdit = new boolean[]{
//                false, false, false, false, false
//            };
//
//            @Override
//            public Class getColumnClass(int columnIndex) {
//                return types[columnIndex];
//            }
//
//            @Override
//            public boolean isCellEditable(int rowIndex, int columnIndex) {
//                return canEdit[columnIndex];
//            }
//        };
////        jTable5 = new JTable(tableModel);
//        jTable5.setModel(tableModel);
//        if (jTable5.getColumnModel().getColumnCount() > 0) {
//            jTable5.getColumnModel().getColumn(0).setMaxWidth(43);
//            jTable5.getColumnModel().getColumn(2).setPreferredWidth(85);
//            jTable5.getColumnModel().getColumn(2).setMaxWidth(85);
//            jTable5.getColumnModel().getColumn(4).setPreferredWidth(70);
//            jTable5.getColumnModel().getColumn(4).setMaxWidth(70);
//        }
//        jPanel2.repaint();
//    }//GEN-LAST:event_jTable4MouseReleased
//
//    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//        // TODO add your handling code here:
//        if (dayuJJXS == true) {
//            jButton5.setText("<=");
//            dayuJJXS = false;
//        } else {
//            jButton5.setText(">=");
//            dayuJJXS = true;
//        }
//    }//GEN-LAST:event_jButton5ActionPerformed
//
//    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
//        // TODO add your handling code here:
//        if (quanxuanGZ == true) {
//            jToggleButton1.setText("全选");
//            quanxuanGZ = false;
//        } else {
//            jToggleButton1.setText("全不选");
//            quanxuanGZ = true;
//        }
//        TableModel table4 = jTable4.getModel();
//        for (int i = 0; i < table4.getRowCount(); i++) {
//            table4.setValueAt(quanxuanGZ, i, 5);
//        }
//        jTable4MouseReleased(null);
//    }//GEN-LAST:event_jToggleButton1ActionPerformed
//
//    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
//        // TODO add your handling code here:
//        System.out.println(r_animalsG.toString());
//        if (jTable3.getModel().getRowCount() == 0) {
//            JOptionPane.showMessageDialog(null, "已选母猪为空，请先统计后选择母猪", "错误", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        if (jTable2.getModel().getRowCount() == 0) {
//            JOptionPane.showMessageDialog(null, "已选信息为空，请添加信息后再计算", "错误", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        if (!(textIsTrue(jTextField1) || textIsTrue(jTextField2))) {
//            return;
//        }
//        this.jjxsYz = Double.parseDouble(jTextField1.getText());
//        this.cjjgts = Integer.parseInt(jTextField2.getText());
//        getZZQYGX();
//        updateXX();
//
//        //读取已选种母猪编号
//        ArrayList<String> r_animalM = new ArrayList();
//        TableModel table = jTable3.getModel();
//        for (int i = 0; i < table.getRowCount(); i++) {
//            if ((boolean) table.getValueAt(i, 3) == true) {
//                r_animalM.add((String) table.getValueAt(i, 0));
////                System.out.println("===已选母猪编号:"+ (String)table.getValueAt(i, 0));
//            }
//        }
//
//        ArrayList<LinkedHashMap<String, Double[]>> ZZXX = new ArrayList();//储存所有猪的6个信息
//
////        for(String mzid : r_animalsM){
////            LinkedHashMap<String, Double[]> MZXX = new LinkedHashMap();
////            Double[] nullXX = new Double[selectedXX.size()+1];
////            MZXX.put(mzid, nullXX);//将一只母猪存到LinkedHashMap里
////            MZXX = selectSix(MZXX);//然后从数据库中select这只母猪的6个信息
////            ZZXX.add(MZXX);        //最后将这只母猪的LinkedHashMap存到ArrayList里
////            System.out.println("mzid" + mzid);
////        }
////        System.out.println("###########" + r_animalsG.toString());
//        LinkedHashMap<String, Double[]> GZXX = new LinkedHashMap();
//        for (String gzid : r_animalsG) {
//            Double[] nullXX = new Double[selectedXX.size() + 1];
//            GZXX.put(gzid, nullXX);//将一只公猪存到LinkedHashMap里
//            System.out.println("gzid" + gzid);
//        }
//
////        System.out.println("###########" + r_animalsG.toString());
//        GZXX = selectCJJG(GZXX);//筛选公猪采精间隔
//        GZXX = selectSix(GZXX);//然后从数据库中select这只公猪的6个信息
//        GZXX = sortGZXX(GZXX);//排序取前10
//        ZZXX.add(GZXX);        //最后将这只公猪的LinkedHashMap存到ArrayList里
//        r_animalsG.clear();
//        r_animalsG.addAll(GZXX.keySet());
//
//        LinkedHashMap<String, Double[]> allJJXS = new LinkedHashMap();
//        LinkedHashMap<String, Double[]> MZXX = new LinkedHashMap();
//        for (String mzid : r_animalM) {
//            Double[] nullXX = new Double[selectedXX.size() + 1];
//            MZXX.put(mzid, nullXX);//将一只母猪存到LinkedHashMap里
////            System.out.println("mzid" + mzid);
//
//            allJJXS = simBreed1(mzid, allJJXS);//根据当前母猪的编号，与所有公猪模拟，筛选出仔猪符合近交系数阈值的公猪
//
////            System.out.println("sim-size=" + allJJXS.size());
////            canBreedGZ = selectCJJG(canBreedGZ);                        //筛选公猪采精间隔
////            System.out.println("CJJG-size=" + canBreedGZ.size());
////            canBreedGZ = selectSix(canBreedGZ);                         //获取所有符合条件公猪的6个EBV信息
////            System.out.println("Six-size=" + canBreedGZ.size());
////            canBreedGZ = sortGZXX(canBreedGZ);
////            System.out.println("sort-size=" + canBreedGZ.size());
//            /*
//            HashMap<String, Double> gzjjxs = selectJJXSYZ(mzid);
//            gzjjxs = selectCJJG(gzjjxs);
//            HashMap<String, Double[]> GZXX = selectSix(gzjjxs);*/
////            ZZXX.add(canBreedGZ);
//        }
//        MZXX = selectSix(MZXX);//然后从数据库中select这只母猪的6个信息
//        MZXX = sortGZXX(MZXX);
//        ZZXX.add(MZXX);        //最后将这只母猪的LinkedHashMap存到ArrayList里
//        r_animalsM.clear();
//        r_animalsM.addAll(MZXX.keySet());
//        try {
//            saveToExcel1(ZZXX, allJJXS);
//        } catch (WriteException ex) {
//            Logger.getLogger(Xyzd.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }//GEN-LAST:event_jButton7ActionPerformed
//
//    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
//        // TODO add your handling code here:
//        try {
//            if (jRadioButton1.isSelected()) {
//                jButton7ActionPerformed(null);
//            } else {
//                jButton1ActionPerformed(null);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "未知错误，请更换参数重试", "错误", JOptionPane.WARNING_MESSAGE);
//        }
//
//    }//GEN-LAST:event_jButton8ActionPerformed
//
//    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
//        // TODO add your handling code here:
//        jButton5.setEnabled(true);
//    }//GEN-LAST:event_jRadioButton2ActionPerformed
//
//    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
//        // TODO add your handling code here:
//        jButton5.setEnabled(false);
//    }//GEN-LAST:event_jRadioButton1ActionPerformed
//
//
//    // Variables declaration - do not modify//GEN-BEGIN:variables
//    private javax.swing.ButtonGroup buttonGroup1;
//    private javax.swing.JButton jButton1;
//    private javax.swing.JButton jButton2;
//    private javax.swing.JButton jButton3;
//    private javax.swing.JButton jButton4;
//    private javax.swing.JButton jButton5;
//    private javax.swing.JButton jButton6;
//    private javax.swing.JButton jButton7;
//    private javax.swing.JButton jButton8;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JLabel jLabel3;
//    private javax.swing.JLabel jLabel4;
//    private javax.swing.JLabel jLabel5;
//    private javax.swing.JLabel jLabel6;
//    private javax.swing.JLabel jLabel7;
//    private javax.swing.JLabel jLabel8;
//    private javax.swing.JPanel jPanel0;
//    private java.awt.CardLayout card;
//    private javax.swing.JPanel jPanel1;
//    private javax.swing.JPanel jPanel2;
//    private javax.swing.JRadioButton jRadioButton1;
//    private javax.swing.JRadioButton jRadioButton2;
//    private javax.swing.JScrollPane jScrollPane1;
//    private javax.swing.JScrollPane jScrollPane2;
//    private javax.swing.JScrollPane jScrollPane3;
//    private javax.swing.JScrollPane jScrollPane4;
//    private javax.swing.JScrollPane jScrollPane5;
//    private javax.swing.JSeparator jSeparator1;
//    private javax.swing.JTable jTable1;
//    private javax.swing.JTable jTable2;
//    private javax.swing.JTable jTable3;
//    private javax.swing.JTable jTable4;
//    private javax.swing.JTable jTable5;
//    private javax.swing.JTextField jTextField1;
//    private javax.swing.JTextField jTextField2;
//    private javax.swing.JToggleButton jToggleButton1;
//    // End of variables declaration//GEN-END:variables
//}
