# Infinity Gauntlet Mod — Fabric 1.21.1 (Phase 1)

## מה יש כאן עכשיו
פריטים אמיתיים, רשומים ועובדים במשחק:
- Infinity Gauntlet
- Power / Space / Mind / Reality / Time / Soul Stone
כולם עם טקסטורות סלע-גלם ייחודיות (violet/blue/yellow/red/green/orange) ונמצאים
בטאב היצירה "Combat". עדיין בלי יכולות מיוחדות — זה הבסיס שעליו נבנה הכל.

## איך להפוך את זה ל-JAR (5-10 דקות, פעם ראשונה)
1. התקן **Java 21** (Temurin/Adoptium מומלץ): https://adoptium.net/
2. פתח את התיקייה הזו ב-**IntelliJ IDEA** (Community מספיק) או ב-VS Code עם Extension Pack for Java.
3. תן ל-Gradle להוריד את התלויות (קורה אוטומטית בפתיחה ראשונה, עם אינטרנט).
4. הרץ בטרמינל של הפרויקט:
   - Windows: `gradlew.bat build`
   - Mac/Linux: `./gradlew build`
5. ה-JAR המוכן יהיה ב: `build/libs/infinity-gauntlet-mod-0.1.0-phase1.jar`
6. התקן **Fabric Loader** + **Fabric API** ל-1.21.1, והכנס את ה-JAR לתיקיית `mods` שלך.

> אם ה-build נכשל בגלל גרסת yarn_mappings/fabric-api — זה קורה כי גרסאות Fabric
> מתעדכנות כל הזמן. תיקון: לך ל-https://fabricmc.net/develop והחלף את הערכים
> ב-`gradle.properties` לגרסאות העדכניות עבור 1.21.1.

## מפת דרכים — מה בונים בהמשך (לפי סדר עדיפויות)
זה הפרויקט מהמסמך שלך, מפורק לשלבים בני-ביצוע:

- **Phase 2 — Socketing מכני**: לחיצת M עם אבן ביד מכניסה אותה לסלוט בכפפה (NBT/Component data), עם אנימציה קצרה וסאונד.
- **Phase 3 — Heart Drain**: מערכת דימום החיים לפי טבלת ה-HP שהגדרת (immune מעל 150, עד death spiral מתחת ל-40).
- **Phase 4 — כוח האבן הראשונה (Power Stone)**: +60 HP, אאורה סגולה, ומתקפות Left-Click/V/B/Z. נתחיל מכאן כי היא המפורטת ביותר ותשמש תבנית לשאר האבנים.
- **Phase 5 — שאר 4 האבנים** (Space/Reality/Soul/Time/Mind), אחת בכל פעם.
- **Phase 6 — ה-Snap**: GUI מתקדם, זמן טעינה תלוי-HP, ואפקט אפר.
- **Phase 7 — הממדים (Morag/Xandar/Vormir/Nidavellir/Titan)**: כל ממד הוא בעצם פרויקט-משנה שלם (biome, structures, mobs, AI) — נבנה כל אחד כתת-שלב נפרד.

מודלים 3D למובים חדשים (Eitri, Sakaran Drones וכו') ידרשו שתפתח **Blockbench**
(חינמי) בשלב מסוים — זו עבודה ויזואלית שאין לי דרך לעשות לבד, אבל אני יכול לתת
לך את קובצי ה-JSON הגיאומטריים הבסיסיים כנקודת התחלה.

## אלטרנטיבה: בניית JAR בענן (בלי להתקין שום דבר על המחשב)
בפרויקט כבר יש קובץ `.github/workflows/build.yml` שגורם ל-GitHub לקמפל
את המוד בשבילך אוטומטית. השלבים:

1. היכנס ל-https://github.com וצור חשבון חינמי (אם אין לך).
2. לחץ על "+" למעלה מימין → "New repository". תן שם (למשל `infinity-gauntlet-mod`),
   השאר "Public" או "Private" — לא משנה — ולחץ "Create repository".
3. בעמוד הריפו החדש, לחץ על "uploading an existing file" (או "Add file" → "Upload files").
4. **חלץ קודם את הזיפ אצלך במחשב**, ואז גרור לתוך הדפדפן את **כל התוכן שבתוך**
   תיקיית `infinity-gauntlet-mod` (לא את התיקייה עצמה — את הקבצים שבפנים: `build.gradle`,
   `src`, `.github` וכו'). שים לב שגם תיקיית `.github` הנסתרת חייבת לעלות.
5. לחץ "Commit changes".
6. עבור ללשונית "Actions" בראש העמוד. תוך דקה-שתיים יופיע ריצה בשם "Build Mod JAR"
   עם עיגול צהוב (רץ) שהופך לירוק (הצליח) אחרי כ-2-3 דקות.
7. לחץ על הריצה שהצליחה (הירוקה) → גלול למטה ל-"Artifacts" → הורד את
   `infinity-gauntlet-mod-jar` (זה יוריד zip קטן שבתוכו ה-JAR האמיתי).
8. חלץ את ה-JAR מתוכו והכנס אותו לתיקיית `mods` שלך, יחד עם Fabric API (שלב 7-8 למעלה).

אם הריצה נכשלת (עיגול אדום) — לחץ עליה, פתח את הלוג, והעתק לי את הודעת
השגיאה ואני אתקן.

## המשך
תגיד לי על איזה Phase להתחיל לעבוד עכשיו (מומלץ: Phase 2, ה-Socketing, כי
בלעדיו האבנים לא "נכנסות" לכפפה) ואני אכתוב את הקוד המלא לזה.
