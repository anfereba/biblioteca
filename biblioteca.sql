-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:33065
-- Tiempo de generación: 30-05-2019 a las 04:20:28
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autor`
--

CREATE TABLE `autor` (
  `Id_Autor` int(7) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Nacionalidad` varchar(50) NOT NULL,
  `Fecha_Nac` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `autor`
--

INSERT INTO `autor` (`Id_Autor`, `Nombre`, `Nacionalidad`, `Fecha_Nac`) VALUES
(16, 'Juan Rufol', 'Colombia', '1996-01-19'),
(17, 'Willian Golding', 'Alemania', '1993-06-19'),
(18, 'Barbara Gostmich', 'Francia', '1956-09-10'),
(19, 'Mario Benedeti', 'Uruguay', '1920-05-17'),
(20, 'Altamirano', 'Mexico', '1967-02-17'),
(21, 'Jose Gonzalez', 'Italia', '1945-02-19'),
(22, 'Ana laura Delgado', 'Mexico', '1988-09-10'),
(23, 'Og Mandino', 'USA', '1934-11-12'),
(24, 'thomas Huxley', 'Japon', '1956-12-12'),
(25, 'Leticia Lopez Juarez', 'Canada', '1954-02-19'),
(26, 'Osar Palacios Ceballos', 'Mexico', '1882-10-12'),
(27, 'Zamná Heredia', 'Portugal', '1983-10-12'),
(28, 'maria Bernaldez ', 'Mexico', '1985-08-24'),
(29, 'Jhon y Rita Lang', 'Italia', '1973-10-16'),
(30, 'Rafael Camacho', 'Chile', '1945-10-11'),
(31, 'Gabriel Garcia Marquez', 'Colombia', '1940-10-10'),
(32, 'James Stewart', 'Canada', '1967-10-12'),
(33, 'Tanenbaum', 'Chile', '1991-05-01'),
(34, 'Serway', 'Usa', '1992-12-24'),
(35, 'Andres Rendon', 'Colombiano', '1998-10-13'),
(36, 'Ana Sierro', 'España', '1997-07-14'),
(37, 'El Jackie Chan', 'China', '1950-10-05'),
(39, 'Joe Lee', 'Canada', '1920-07-12'),
(40, 'Gabriel Pineda', 'Colombia', '1920-07-12'),
(42, 'Willian Shakespear', 'Alemania', '1987-10-09');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `costeo`
--

CREATE TABLE `costeo` (
  `Id_Costeo` int(11) NOT NULL,
  `N_Prestamo` int(11) NOT NULL,
  `Id_Reserva` int(11) NOT NULL,
  `Fecha_Retornado` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `costeo`
--

INSERT INTO `costeo` (`Id_Costeo`, `N_Prestamo`, `Id_Reserva`, `Fecha_Retornado`) VALUES
(14, 75, 15, '2019-05-14'),
(15, 80, 20, '2019-05-24'),
(16, 79, 19, '2019-05-31'),
(17, 78, 18, '2019-05-29'),
(18, 76, 16, '2019-06-28'),
(19, 82, 22, '2019-05-18'),
(20, 83, 23, NULL),
(21, 85, 25, '2019-05-30'),
(22, 81, 21, NULL),
(23, 86, 26, NULL),
(24, 84, 24, NULL),
(25, 87, 27, NULL),
(26, 77, 17, NULL),
(27, 77, 17, NULL),
(28, 88, 28, NULL),
(29, 89, 29, '2019-06-20'),
(30, 90, 30, NULL),
(31, 91, 31, '2021-09-30');

--
-- Disparadores `costeo`
--
DELIMITER $$
CREATE TRIGGER `VALIDARDEV_AI` AFTER UPDATE ON `costeo` FOR EACH ROW UPDATE reservas SET Id_Estado = 3 WHERE Id_Reserva = NEW.Id_Reserva
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `detalleprestamo`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `detalleprestamo` (
`Id_Lector` int(7)
,`nombre` varchar(50)
,`apellido` varchar(50)
,`Id_Libro` int(7)
,`Titulo` varchar(50)
,`Fecha_Prestamo` date
,`Fecha_Devuelto` date
,`Fecha_Retornado` date
,`total` bigint(10)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `detallereserva`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `detallereserva` (
`Id_Reserva` int(11)
,`Id_Lector` int(7)
,`nombre` varchar(50)
,`apellido` varchar(50)
,`NombreLibro` varchar(50)
,`Fecha_Prestamo` date
,`Estado_Prestamo` varchar(50)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `detalle_libro`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `detalle_libro` (
`Id_Libro` int(7)
,`Titulo` varchar(50)
,`Nombre` varchar(30)
);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estados`
--

CREATE TABLE `estados` (
  `Id_Estado` int(11) NOT NULL,
  `Descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estados`
--

INSERT INTO `estados` (`Id_Estado`, `Descripcion`) VALUES
(1, 'Pendiente'),
(2, 'En Prestamo'),
(3, 'Devuelto');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado_estudiante`
--

CREATE TABLE `estado_estudiante` (
  `Id_EstadoEstudiante` int(11) NOT NULL,
  `Estado_Estudiante` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estado_estudiante`
--

INSERT INTO `estado_estudiante` (`Id_EstadoEstudiante`, `Estado_Estudiante`) VALUES
(1, 'ACTIVO'),
(2, 'SUSPENDIDO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `Id_Lector` int(7) NOT NULL,
  `CC` bigint(20) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `carrera` varchar(50) NOT NULL,
  `Fecha_Nac` date NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` int(10) NOT NULL,
  `Id_EstadoEstudiante` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`Id_Lector`, `CC`, `nombre`, `apellido`, `direccion`, `carrera`, `Fecha_Nac`, `telefono`, `email`, `password`, `Id_EstadoEstudiante`) VALUES
(31, 1013513417, 'Maria', 'crispin', 'nochetriste', 'contabilidad', '2000-04-02', 2147483647, 'elmismocorreodesiempre01@yopmail.com', 1234, 1),
(32, 1014553467, 'Johathan', 'Gomez', 'Avenida Chile 45 30', 'Tecnico en refrigeracion y empuje', '2001-05-10', 2147483647, 'elmismocorreodesiempre02@yopmail.com', 1234, 1),
(33, 1014512497, 'roberto', 'Sanchez\r\nMejia', 'flor de azalia SN', 'agrobiotecnologia', '2000-01-01', 2147483647, 'elmismocorreodesiempre03@yopmail.com', 1234, 1),
(34, 1013413414, 'Paola', 'Cervantes\r\nCastillo', 'Av. Zaragoza', 'contabilidad', '1998-10-05', 2147483647, 'elmismocorreodesiempre04@yopmail.com', 1234, 1),
(35, 1014713427, 'mayra', 'Hernandez\r\nSanchez', 'Allende No 3', 'alimentos', '1997-03-30', 2147483647, 'elmismocorreodesiempre05@yopmail.com', 1234, 1),
(36, 1015513410, 'ivan', 'Trejo Aragon', 'Galeana\r\nNo23', 'contabilidad', '2001-05-19', 2147483647, 'elmismocorreodesiempre06@yopmail.com', 1234, 1),
(37, 1012513417, 'Alexander', 'Borregero\r Cerero', 'Guerrero No9999', 'contabilidad', '2002-09-09', 2147483647, 'elmismocorreodesiempre07@yopmail.com', 1234, 1),
(38, 1011513410, 'Erick', 'Diaz olalde', 'Puerta\r Norte No 8', 'Agrobiotecnologia', '2002-10-10', 2147483647, 'elmismocorreodesiempre08@yopmail.com', 1234, 1),
(39, 1010513417, 'luis', 'Chaltel\r\nGaspar', 'noche triste', 'paramedicos', '1997-10-11', 2147483647, 'elmismocorreodesiempre09@yopmail.com', 1234, 1),
(40, 1009513210, 'Enrique', 'Aldama\r\nLeyte', 'ahuehuetes ', 'tic-si', '1999-03-14', 2147483647, 'elmismocorreodesiempre10@yopmail.com', 1234, 1),
(41, 1008513417, 'raul', 'Valdez Alanes', 'noche triste No9', 'administrador', '1990-01-25', 2147483647, 'elmismocorreodesiempre11@yopmail.com', 1234, 1),
(42, 1007513210, 'Sandra', 'Guzman\r\nAgurre', 'Hidalgo No12', 'contabilidad', '2002-11-22', 2147483647, 'elmismocorreodesiempre12@yopmail.com', 1234, 1),
(43, 1006513417, 'Maricruz', 'Crispin\r\nClaveria', 'Mariano Matamoros SN', 'contabilidad', '1996-04-09', 2147483647, 'elmismocorreodesiempre13@yopmail.com', 1234, 1),
(44, 1005512410, 'Gabriel', ' Liberato\r\nCuacuamoxtla', 'Cuauhtemoc', 'administracion', '1998-10-23', 2147483647, 'elmismocorreodesiempre14@yopmail.com', 1234, 1),
(45, 1014513417, 'Marisol', 'Jimenez\r JLopez', 'Los pinos No15', 'tic-si', '1999-12-12', 2147483647, 'elmismocorreodesiempre15@yopmail.com', 1234, 1),
(46, 1017512410, 'LIL', 'Rendon', 'El bronx', 'Ing de sistemas', '1994-07-19', 2147483647, 'elmismocorreodesiempre17@yopmail.com', 1234, 1),
(47, 1018513417, 'Johathan', 'Garzon', 'Avenida 26', 'Ing Ambiental', '2000-08-20', 2147483647, 'elmismocorreodesiempre18@yopmail.com', 1234, 1),
(48, 1019513210, 'dasdasdsa', 'adasdsad', 'adasdasd', 'asdasd', '2018-12-02', 2147483647, 'dasdasdas@yopmail.com', 1234, 1),
(49, 1012513417, 'Andres', 'Cardenas', 'Avenida Jimenez', 'Industrial', '2000-10-16', 2147483647, 'cardenasxd0001@yopmail.com', 1234, 1),
(50, 1013512410, 'Juan', 'DASDASD', 'AFSFASFAS', 'DASDSADASDASD', '2009-10-11', 2147483647, 'Ssadsad@yopmail.com', 1234, 1),
(51, 1011583417, 'asdasd', 'sadas', 'dsadas', 'sadasd', '2007-05-09', 2147483647, 'dsadsad', 0, 1),
(52, 1010512417, 'Alejo', 'Ramirez', 'Calle 45 avenida', 'Ing Industrial', '1998-08-05', 2147483647, 'alejoramirez@yopmail.com', 1234, 1),
(53, 1013526192, 'Maria', 'adasdsad', 'La L', 'Derecho', '1992-05-02', 3142768192, 'toretoo@yopmail.com', 1234, 1),
(54, 1013562821, 'Juan', 'Stallin', 'Avenida Cali', 'Derecho', '1990-05-02', 135268193, 'elmismo333@yopmail.com', 1234, 1),
(55, 101352718, 'Brandon', 'Tabares', 'Avenida Editada', 'Ing Industrial', '1996-08-14', 21213232, 'brandonxd888@gmail.com', 1359, 1),
(57, 121321321, 'Fabian', 'Molina', 'Avenida Editada', 'Ing SIstemas', '1985-08-08', 21312321, 'Brandonmolina@yopmail.com', 1235, 1),
(58, 1013564738, 'Millos', 'David', 'Avenida 888', 'Ingenieria Industrial', '1988-09-09', 3219281828, 'ricardo@yopmail.com', 1234, 1),
(59, 10101010, 'Andres', 'Rendon', 'Cra 45 b 77', 'Ingenieria Sistemas', '1998-09-01', 3229999999, 'anfereba@live.com', 1357, 1),
(60, 1027182712, 'Blanca', 'Palma', 'Avenida Brasil', 'Derecho', '1996-06-01', 3218271829, 'blancapalma@yopmail.com', 1234, 1),
(61, 3123213213, 'dasdasdasdasd', 'sadasdsaddasdasd', 'sadasdasdasdsadsad', 'sadsadasdasdsadsadasddasdasddsa', '2019-05-09', 2321312321, '111', 111, 1),
(62, 3123213213, 'dasdasdasdasd', 'sadasdsaddasdasd', 'sadasdasdasdsadsad', 'sadsadasdasdsadsadasddasdasddsa', '2019-05-09', 2321312321, '333', 111, 1),
(63, 5667567567, 'yvyhvhjvhj', 'gvguvhvhvhvj', 'hgvjhvjhvhj', 'gvhvhjvjhv jv jh', '2019-05-17', 6876786786, 'abcde', 1234, 1),
(64, 5667567567, 'hjhjbhjb', 'gvguvhvhvhvj', 'hgvjhvjhvhj', 'gvhvhjvjhv jv jh', '2019-05-17', 6876786786, 'abcde', 1234, 1),
(65, 1027182718, 'Daniel', 'Ramirez', 'Avenida 188', 'La vida', '1996-08-02', 3228182199, 'danielramirez@yopmail.com', 1234, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libaut`
--

CREATE TABLE `libaut` (
  `Id_Autor` int(11) NOT NULL,
  `Id_Libro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `libaut`
--

INSERT INTO `libaut` (`Id_Autor`, `Id_Libro`) VALUES
(16, 1),
(17, 2),
(18, 3),
(19, 4),
(20, 5),
(21, 6),
(22, 7),
(23, 8),
(24, 9),
(25, 10),
(26, 11),
(27, 12),
(28, 13),
(29, 14),
(30, 15),
(30, 1),
(33, 16),
(32, 17),
(37, 20),
(39, 21),
(40, 22),
(16, 6),
(16, 2),
(18, 1),
(42, 23);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `Id_Libro` int(7) NOT NULL,
  `Titulo` varchar(50) NOT NULL,
  `Editorial` varchar(50) NOT NULL,
  `Area` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`Id_Libro`, `Titulo`, `Editorial`, `Area`) VALUES
(1, 'El señor de las moscas', 'Santillana', 'novela'),
(2, 'La Esclava', 'Porruo', 'Narracion'),
(3, 'El Señor de los Anillos', 'FCE', 'Internet'),
(4, 'Don Quijote de la\r Moncha', 'Grijalva', 'Narracion'),
(5, 'visual Estudio Net', 'Alfay\r\nOmega', 'informatica'),
(6, 'Base de Datos', 'Alfay\r\nOmega', 'informatica'),
(7, 'Ingenieria de Software', 'Alfay\r\nOmega', 'informatica'),
(8, 'Un Mexicano Mas', 'planeta', 'novela'),
(9, 'Entregame tu\r\ncorazon', 'Marruecos', 'Novela'),
(10, 'Harry Potter', 'edicciones\r\nprado', 'Internet'),
(11, 'Harry Potter:Las Reliquias de la Muerte\r\n', 'edicciones prado', 'Internet'),
(12, 'Orgullo y\r\nPrejuicio', 'Marruecos', 'Novela'),
(13, 'Romeo y Julienta', 'Marruecos', 'Novela'),
(14, 'Navidad en las\r\nMontañas', 'Marruecos', 'Narracion'),
(15, 'El Señor de los Anillos: Las Dos\r\nTorres', 'FCE', 'Internet'),
(16, 'Sistemas Operativos Modernos', 'Alfaguara', 'Internet'),
(17, 'Calculo de Varias Variables', 'Pearson', 'Internet'),
(18, 'Fundamentos de Fisica', 'Pearson', 'Fisico'),
(19, '12 cuentos peregrinos', 'Alfaguara', 'Novela'),
(20, 'La Lucha', 'Santillana', 'Narracion'),
(21, 'Spider Man 2', 'MARVEL', 'Novela'),
(22, 'Spider Man 5', 'MARVEL', 'Novela'),
(23, 'Hamlett', 'DC', 'Comics');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `N_Prestamo` int(11) NOT NULL,
  `Id_Reserva` int(11) NOT NULL,
  `Fecha_Prestamo` date NOT NULL,
  `Fecha_Devuelto` date AS (DATE_ADD(Fecha_Prestamo, INTERVAL 07 DAY)) VIRTUAL,
  `validado` varchar(2) NOT NULL DEFAULT 'NO'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `prestamo`
--

INSERT INTO `prestamo` (`N_Prestamo`, `Id_Reserva`, `Fecha_Prestamo`, `Fecha_Devuelto`, `validado`) VALUES
(75, 15, '2019-05-05', '2019-05-12', 'SI'),
(76, 16, '2019-05-05', '2019-05-12', 'SI'),
(77, 17, '2019-05-05', '2019-05-12', 'SI'),
(78, 18, '2019-05-06', '2019-05-13', 'SI'),
(79, 19, '2019-05-07', '2019-05-14', 'SI'),
(80, 20, '2019-05-09', '2019-05-16', 'SI'),
(81, 21, '2019-05-10', '2019-05-17', 'SI'),
(82, 22, '2019-05-10', '2019-05-17', 'SI'),
(83, 23, '2019-05-10', '2019-05-17', 'SI'),
(84, 24, '2019-05-10', '2019-05-17', 'SI'),
(85, 25, '2019-05-10', '2019-05-17', 'SI'),
(86, 26, '2019-05-13', '2019-05-20', 'SI'),
(87, 27, '2019-05-14', '2019-05-21', 'SI'),
(88, 28, '2019-05-14', '2019-05-21', 'SI'),
(89, 29, '2019-05-27', '2019-06-03', 'SI'),
(90, 30, '2019-05-29', '2019-06-05', 'SI'),
(91, 31, '2019-05-29', '2019-06-05', 'SI');

--
-- Disparadores `prestamo`
--
DELIMITER $$
CREATE TRIGGER `abc` AFTER UPDATE ON `prestamo` FOR EACH ROW BEGIN
		UPDATE reservas SET Id_Estado = 2 WHERE Id_Reserva = NEW.Id_Reserva;
		INSERT INTO costeo (N_Prestamo,Id_Reserva) VALUES (NEW.N_Prestamo,NEW.Id_Reserva);
	END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `Id_Reserva` int(11) NOT NULL,
  `Id_Lector` int(7) NOT NULL,
  `Id_Libro` int(7) NOT NULL,
  `Fecha_Prestamo` date NOT NULL,
  `Id_Estado` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reservas`
--

INSERT INTO `reservas` (`Id_Reserva`, `Id_Lector`, `Id_Libro`, `Fecha_Prestamo`, `Id_Estado`) VALUES
(15, 40, 2, '2019-05-05', 3),
(16, 55, 6, '2019-05-05', 3),
(17, 38, 13, '2019-05-05', 2),
(18, 51, 16, '2019-05-06', 3),
(19, 57, 9, '2019-05-07', 3),
(20, 34, 7, '2019-05-09', 3),
(21, 57, 4, '2019-05-10', 2),
(22, 57, 1, '2019-05-10', 3),
(23, 59, 20, '2019-05-10', 2),
(24, 59, 15, '2019-05-10', 2),
(25, 35, 21, '2019-05-10', 3),
(26, 58, 5, '2019-05-13', 2),
(27, 58, 20, '2019-05-14', 2),
(28, 63, 2, '2019-05-14', 2),
(29, 65, 17, '2019-05-27', 3),
(30, 32, 23, '2019-05-29', 2),
(31, 38, 20, '2019-05-29', 3);

--
-- Disparadores `reservas`
--
DELIMITER $$
CREATE TRIGGER `ActualizarInfo` AFTER INSERT ON `reservas` FOR EACH ROW BEGIN
		INSERT INTO prestamo (Id_Reserva, Fecha_Prestamo) VALUES					(NEW.Id_Reserva,NEW.Fecha_Prestamo);

		
	END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `BORRAR_AD` AFTER DELETE ON `reservas` FOR EACH ROW DELETE from prestamo where prestamo.Id_Reserva = old.Id_Reserva
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vistadevolverlibro`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vistadevolverlibro` (
`Id_Costeo` int(11)
,`N_Prestamo` int(11)
,`Id_Libro` int(7)
,`Id_Reserva` int(11)
,`nombre` varchar(50)
,`apellido` varchar(50)
,`NombreLibro` varchar(50)
,`Fecha_Prestamo` date
,`Fecha_Devuelto` date
,`Fecha_Retornado` date
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vistareservasusuario`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vistareservasusuario` (
`Id_Reserva` int(11)
,`Id_Lector` int(7)
,`nombre` varchar(50)
,`apellido` varchar(50)
,`Titulo` varchar(50)
,`Fecha_Prestamo` date
,`Fecha_Devuelto` date
,`EstadoPrestamo` varchar(50)
);

-- --------------------------------------------------------

--
-- Estructura Stand-in para la vista `vistavalidarprestamo`
-- (Véase abajo para la vista actual)
--
CREATE TABLE `vistavalidarprestamo` (
`N_Prestamo` int(11)
,`Id_Reserva` int(11)
,`Id_Lector` int(7)
,`nombre` varchar(50)
,`apellido` varchar(50)
,`NombreLibro` varchar(50)
,`Fecha_Prestamo` date
,`Fecha_Devuelto` date
,`validado` varchar(2)
);

-- --------------------------------------------------------

--
-- Estructura para la vista `detalleprestamo`
--
DROP TABLE IF EXISTS `detalleprestamo`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `detalleprestamo`  AS  select `estudiante`.`Id_Lector` AS `Id_Lector`,`estudiante`.`nombre` AS `nombre`,`estudiante`.`apellido` AS `apellido`,`libro`.`Id_Libro` AS `Id_Libro`,`libro`.`Titulo` AS `Titulo`,`reservas`.`Fecha_Prestamo` AS `Fecha_Prestamo`,`prestamo`.`Fecha_Devuelto` AS `Fecha_Devuelto`,`costeo`.`Fecha_Retornado` AS `Fecha_Retornado`,((to_days(`costeo`.`Fecha_Retornado`) - to_days(`prestamo`.`Fecha_Devuelto`)) * 700) AS `total` from ((((`estudiante` join `reservas` on((`reservas`.`Id_Lector` = `estudiante`.`Id_Lector`))) join `libro` on((`libro`.`Id_Libro` = `reservas`.`Id_Libro`))) join `prestamo` on((`prestamo`.`Id_Reserva` = `reservas`.`Id_Reserva`))) join `costeo` on((`costeo`.`N_Prestamo` = `prestamo`.`N_Prestamo`))) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `detallereserva`
--
DROP TABLE IF EXISTS `detallereserva`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `detallereserva`  AS  select `reservas`.`Id_Reserva` AS `Id_Reserva`,`estudiante`.`Id_Lector` AS `Id_Lector`,`estudiante`.`nombre` AS `nombre`,`estudiante`.`apellido` AS `apellido`,`libro`.`Titulo` AS `NombreLibro`,`reservas`.`Fecha_Prestamo` AS `Fecha_Prestamo`,`estados`.`Descripcion` AS `Estado_Prestamo` from (((`estudiante` join `reservas` on((`estudiante`.`Id_Lector` = `reservas`.`Id_Lector`))) join `libro` on((`libro`.`Id_Libro` = `reservas`.`Id_Libro`))) join `estados` on((`reservas`.`Id_Estado` = `estados`.`Id_Estado`))) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `detalle_libro`
--
DROP TABLE IF EXISTS `detalle_libro`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `detalle_libro`  AS  select `libro`.`Id_Libro` AS `Id_Libro`,`libro`.`Titulo` AS `Titulo`,`autor`.`Nombre` AS `Nombre` from ((`libaut` join `autor` on((`autor`.`Id_Autor` = `libaut`.`Id_Autor`))) join `libro` on((`libaut`.`Id_Libro` = `libro`.`Id_Libro`))) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vistadevolverlibro`
--
DROP TABLE IF EXISTS `vistadevolverlibro`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistadevolverlibro`  AS  select `costeo`.`Id_Costeo` AS `Id_Costeo`,`costeo`.`N_Prestamo` AS `N_Prestamo`,`reservas`.`Id_Libro` AS `Id_Libro`,`reservas`.`Id_Reserva` AS `Id_Reserva`,`estudiante`.`nombre` AS `nombre`,`estudiante`.`apellido` AS `apellido`,`libro`.`Titulo` AS `NombreLibro`,`reservas`.`Fecha_Prestamo` AS `Fecha_Prestamo`,`prestamo`.`Fecha_Devuelto` AS `Fecha_Devuelto`,`costeo`.`Fecha_Retornado` AS `Fecha_Retornado` from ((((`costeo` join `prestamo` on((`costeo`.`N_Prestamo` = `prestamo`.`N_Prestamo`))) join `reservas` on((`reservas`.`Id_Reserva` = `prestamo`.`Id_Reserva`))) join `estudiante` on((`estudiante`.`Id_Lector` = `reservas`.`Id_Lector`))) join `libro` on((`libro`.`Id_Libro` = `reservas`.`Id_Libro`))) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vistareservasusuario`
--
DROP TABLE IF EXISTS `vistareservasusuario`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistareservasusuario`  AS  select `reservas`.`Id_Reserva` AS `Id_Reserva`,`estudiante`.`Id_Lector` AS `Id_Lector`,`estudiante`.`nombre` AS `nombre`,`estudiante`.`apellido` AS `apellido`,`libro`.`Titulo` AS `Titulo`,`prestamo`.`Fecha_Prestamo` AS `Fecha_Prestamo`,`prestamo`.`Fecha_Devuelto` AS `Fecha_Devuelto`,`estados`.`Descripcion` AS `EstadoPrestamo` from ((((`reservas` join `prestamo` on((`prestamo`.`Id_Reserva` = `reservas`.`Id_Reserva`))) join `estados` on((`reservas`.`Id_Estado` = `estados`.`Id_Estado`))) join `libro` on((`reservas`.`Id_Libro` = `libro`.`Id_Libro`))) join `estudiante` on((`reservas`.`Id_Lector` = `estudiante`.`Id_Lector`))) ;

-- --------------------------------------------------------

--
-- Estructura para la vista `vistavalidarprestamo`
--
DROP TABLE IF EXISTS `vistavalidarprestamo`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vistavalidarprestamo`  AS  select `prestamo`.`N_Prestamo` AS `N_Prestamo`,`prestamo`.`Id_Reserva` AS `Id_Reserva`,`reservas`.`Id_Lector` AS `Id_Lector`,`estudiante`.`nombre` AS `nombre`,`estudiante`.`apellido` AS `apellido`,`libro`.`Titulo` AS `NombreLibro`,`prestamo`.`Fecha_Prestamo` AS `Fecha_Prestamo`,`prestamo`.`Fecha_Devuelto` AS `Fecha_Devuelto`,`prestamo`.`validado` AS `validado` from (((`prestamo` join `reservas` on((`reservas`.`Id_Reserva` = `prestamo`.`Id_Reserva`))) join `estudiante` on((`estudiante`.`Id_Lector` = `reservas`.`Id_Lector`))) join `libro` on((`reservas`.`Id_Libro` = `libro`.`Id_Libro`))) ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`Id_Autor`);

--
-- Indices de la tabla `costeo`
--
ALTER TABLE `costeo`
  ADD PRIMARY KEY (`Id_Costeo`),
  ADD KEY `N_Prestamo` (`N_Prestamo`),
  ADD KEY `Id_Reserva` (`Id_Reserva`);

--
-- Indices de la tabla `estados`
--
ALTER TABLE `estados`
  ADD PRIMARY KEY (`Id_Estado`);

--
-- Indices de la tabla `estado_estudiante`
--
ALTER TABLE `estado_estudiante`
  ADD PRIMARY KEY (`Id_EstadoEstudiante`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`Id_Lector`),
  ADD KEY `Id_EstadoEstudiante` (`Id_EstadoEstudiante`),
  ADD KEY `Id_EstadoEstudiante_2` (`Id_EstadoEstudiante`);

--
-- Indices de la tabla `libaut`
--
ALTER TABLE `libaut`
  ADD KEY `Id_Libro` (`Id_Libro`),
  ADD KEY `Id_Autor` (`Id_Autor`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`Id_Libro`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`N_Prestamo`),
  ADD KEY `Id_Reserva` (`Id_Reserva`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`Id_Reserva`),
  ADD KEY `Id_Lector` (`Id_Lector`),
  ADD KEY `Id_Libro` (`Id_Libro`),
  ADD KEY `Id_Estado` (`Id_Estado`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `autor`
--
ALTER TABLE `autor`
  MODIFY `Id_Autor` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT de la tabla `costeo`
--
ALTER TABLE `costeo`
  MODIFY `Id_Costeo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `estados`
--
ALTER TABLE `estados`
  MODIFY `Id_Estado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `estado_estudiante`
--
ALTER TABLE `estado_estudiante`
  MODIFY `Id_EstadoEstudiante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `Id_Lector` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=66;

--
-- AUTO_INCREMENT de la tabla `libro`
--
ALTER TABLE `libro`
  MODIFY `Id_Libro` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  MODIFY `N_Prestamo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=92;

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `Id_Reserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `costeo`
--
ALTER TABLE `costeo`
  ADD CONSTRAINT `costeo_ibfk_1` FOREIGN KEY (`N_Prestamo`) REFERENCES `prestamo` (`N_Prestamo`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `costeo_ibfk_2` FOREIGN KEY (`Id_Reserva`) REFERENCES `reservas` (`Id_Reserva`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD CONSTRAINT `estudiante_ibfk_1` FOREIGN KEY (`Id_EstadoEstudiante`) REFERENCES `estado_estudiante` (`Id_EstadoEstudiante`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `libaut`
--
ALTER TABLE `libaut`
  ADD CONSTRAINT `libaut_ibfk_1` FOREIGN KEY (`Id_Libro`) REFERENCES `libro` (`Id_Libro`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `libaut_ibfk_2` FOREIGN KEY (`Id_Autor`) REFERENCES `autor` (`Id_Autor`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD CONSTRAINT `prestamo_ibfk_1` FOREIGN KEY (`Id_Reserva`) REFERENCES `reservas` (`Id_Reserva`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`Id_Lector`) REFERENCES `estudiante` (`Id_Lector`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`Id_Libro`) REFERENCES `libro` (`Id_Libro`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservas_ibfk_3` FOREIGN KEY (`Id_Estado`) REFERENCES `estados` (`Id_Estado`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
