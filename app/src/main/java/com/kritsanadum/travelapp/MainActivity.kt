package com.kritsanadum.travelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        
        tv_header.text = "เลือกสถานที่ ที่ต้องการ"
        tv_content.text = ""

        btn_place1.setOnClickListener {

            setResult("พระธาตุช่อแฮ",
                     "พระธาตุช่อแฮ พระธาตุประจำปีเกิดปีเสือ (ปีขาล) พระธาตุช่อแฮ เป็นพระธาตุ1 ใน12 ราศี คือ เป็นพระธาตุประจำปีเกิด สำหรับคน ที่เกิดปีเสือ (ปีขาล) หากนำผ้าแพรสามสีไปถวายจะทำให้ชีวิตมีพลังคุ้มครองป้องกันศัตรูได้ การสวดและไหว้ ให้เริ่มต้นนะโม 3 จบ แล้วสวดตามด้วยคาถาบูชาพระธาตุ 5 จบ พลังบารมีจะดลบันดาลให้มีชีวิตที่ดีขึ้น พระธาตุช่อแฮ หมายถึง เจดีย์บรรจุพระบรม สารีริกธาตุพระศอกซ้ายและพระเกศาธาตุของสมเด็จพระสัมมาสัมพุทธเจ้าและประดับบูชาด้วยผ้าแพรอย่างดี",
                       1)


        }


        btn_place2.setOnClickListener {

            setResult("แพะเมืองผี",
                "แพะเมืองผี จังหวัดแพร่ เกิดจากสภาพภูมิประเทศซึ่งเป็นดิน และหินทรายถูกกัดเซาะตามธรรมชาติเป็นรูปร่างลักษณะต่างๆ แพะแปลว่า ป่าละเมาะ",
                2)

        }

        btn_place3.setOnClickListener {


            setResult("ถ้ำผานางคอย",
                "ถ้ำผานางคอย เป็นถ้ำที่มีมายาวนานแล้ว ถ้ำที่เกิดจากธรรมชาติมีลักษณะเป็นหน้าผาสูง ภายในถ้ำมีหินงอกหินย้อย มีก้อนหินรูปร่างคล้ายหญิงสาวนั่งอุ้มลูกน้อยรอคอยคนรัก ชาวบ้านเรียกหินก้อนนี้ว่า หินนางคอย มีตำนานพื้นบ้านที่เล่าต่อกันมาว่า เมื่อ 800 ปี อาณาจักรแสนหวีมีกษัตริย์องค์หนึ่ง ปกครองด้วยทศพิธราชธรรม พระองค์มีพระราชธิดาที่ทรงเลอโฉมนามว่า อรัญญาณี พระนางทรงมีพระทัยโอบอ้อมอารีย์ ในคราวหนึ่งพระนางทรงสำราญทางชลมาพร้อมด้วยข้าราชบริพาร เรือพระที่นั่งถูกพายุพัดกระหน่ำจมลง พวกข้าราชบริพารพากันหนีเอาตัวรอดตามลำพัง เว้นแต่คนองเดช หัวหน้าฝีพายหนุ่มได้เข้าช่วยพระนางไว้ทันและพาพระนางเข้าฝั่งอย่างปลอดภัย ด้วยความใกล้ชิดและสำนึกในบุญคุณในความจงรักภักดีที่ช่วยผยุงฝาอันตราย",
                3)

        }


    }

    fun setResult(header : String , content : String ,place : Int){

        tv_header.text = header
        tv_content.text = content

        if(place == 1){

            img_result.setImageResource(R.drawable.place1)

        }else if(place == 2){

            img_result.setImageResource(R.drawable.place2)

        }else if(place == 3 ){

            img_result.setImageResource(R.drawable.place3)
        }


    }


}
